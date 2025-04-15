package com.ResumeAi.resume_anlyzer.dto;

public class ResumeAnalysisCombinedResponseDTO {
    private String aiAnalysis;
    private int score;
    private String suggestions;

    // Constructors
    public ResumeAnalysisCombinedResponseDTO() {
    }

    public ResumeAnalysisCombinedResponseDTO(String aiAnalysis, int score, String suggestions) {
        this.aiAnalysis = aiAnalysis;
        this.score = score;
        this.suggestions = suggestions;
    }

    // Getters and setters
    public String getAiAnalysis() {
        return aiAnalysis;
    }

    public void setAiAnalysis(String aiAnalysis) {
        this.aiAnalysis = aiAnalysis;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }
}
