package com.ResumeAi.resume_anlyzer.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class OpenAiService {

    

    private static final String OPENAI_URL = "https://api.openai.com/v1/completions";

    public String getResumeAnalysis(String resumeText) {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer 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 ");

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", "text-davinci-003");
        requestBody.put("prompt", "Analyze the following resume and give feedback:\n" + resumeText);
        requestBody.put("max_tokens", 300);

        try {
            String jsonBody = objectMapper.writeValueAsString(requestBody);
            HttpEntity<String> entity = new HttpEntity<>(jsonBody, headers);

            ResponseEntity<String> response = restTemplate.exchange(
                    OPENAI_URL, HttpMethod.POST, entity, String.class
            );

            return response.getBody();
        } catch (Exception e) {
            return "Error processing request: " + e.getMessage();
        }
    }
}
