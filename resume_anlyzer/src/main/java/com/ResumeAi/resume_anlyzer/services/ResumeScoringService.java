package com.ResumeAi.resume_anlyzer.services;

import com.ResumeAi.resume_anlyzer.dto.ResumeScoreDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResumeScoringService {

    // List of required keywords for scoring
    private static final List<String> REQUIRED_KEYWORDS = List.of("Java", "Spring Boot", "SQL", "Microservices");

    // Method to score the resume based on text
    public ResumeScoreDTO scoreResume(String resumeText) {
        int score = 0;

        // Score based on required keywords
        for (String keyword : REQUIRED_KEYWORDS) {
            if (resumeText.contains(keyword)) {
                score += 10;  // Add 10 points for each keyword found
            }
        }

        // Score based on the length of the resume (basic example)
        int lengthScore = Math.min(resumeText.split(" ").length / 100, 5); // 5 points for every 100 words
        score += lengthScore;

        // Suggest improvements (basic example)
        String suggestion = "Your resume is good! Consider adding more specific skills or projects.";

        // Return the result as a DTO
        return new ResumeScoreDTO(score, suggestion);
    }
}
