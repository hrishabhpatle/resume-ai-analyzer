package com.ResumeAi.resume_anlyzer.controller;

import com.ResumeAi.resume_anlyzer.dto.ResumeAnalysisCombinedResponseDTO;
import com.ResumeAi.resume_anlyzer.dto.ResumeScoreDTO;
import com.ResumeAi.resume_anlyzer.services.OpenAiService;
import com.ResumeAi.resume_anlyzer.services.ResumeAnalysisService;
import com.ResumeAi.resume_anlyzer.services.ResumeScoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {
    @Autowired
    private ResumeAnalysisService analysisService;
 @Autowired
   private OpenAiService openAiService;
    @Autowired
    private ResumeScoringService resumeScoringService;
    @PostMapping("/upload")
    public ResponseEntity<String> uploadResume(@RequestParam("file") MultipartFile file) {
        try {
            String text = analysisService.extractTextFromPDF(file);
            return ResponseEntity.ok(text);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error extracting text: " + e.getMessage());
        }
    }
    @PostMapping("/analyze")
    public ResponseEntity<ResumeAnalysisCombinedResponseDTO> analyzeResume(@RequestBody String resumeText) {
        // Step 1: Get AI analysis

        String aiResponse = openAiService.getResumeAnalysis(resumeText);

        // Step 2: Score the resume
        ResumeScoreDTO scoreDTO = resumeScoringService.scoreResume(resumeText);

        // Step 3: Combine into final DTO
        ResumeAnalysisCombinedResponseDTO combinedResponse = new ResumeAnalysisCombinedResponseDTO();
        combinedResponse.setAiAnalysis(aiResponse);
        combinedResponse.setScore(scoreDTO.getScore());
        combinedResponse.setSuggestions(scoreDTO.getSuggestions());

        return ResponseEntity.ok(combinedResponse);
    }

}
