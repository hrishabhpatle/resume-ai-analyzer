package com.ResumeAi.resume_anlyzer.dto;

public class ResumeScoreDTO {
    private int score;
    private String suggestions;

    public ResumeScoreDTO(int score, String suggestions) {
        this.score = score;
        this.suggestions = suggestions;
    }

    public int getScore() {
        return score;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }
}
