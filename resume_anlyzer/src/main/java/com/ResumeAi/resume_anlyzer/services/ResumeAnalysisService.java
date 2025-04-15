package com.ResumeAi.resume_anlyzer.services;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
@Service
public class ResumeAnalysisService {
    public String extractTextFromPDF(MultipartFile file) throws Exception {
        try (InputStream input = file.getInputStream();
             PDDocument document = PDDocument.load(input)) {

            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }
}
