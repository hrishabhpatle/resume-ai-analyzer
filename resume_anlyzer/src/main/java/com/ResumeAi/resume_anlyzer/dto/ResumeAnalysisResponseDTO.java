package com.ResumeAi.resume_anlyzer.dto;

import java.util.List;

public class ResumeAnalysisResponseDTO {
    private String summary;
    private List<String> keySkills;
    private List<String> suggestions;

    // Constructors
    public ResumeAnalysisResponseDTO() {
    }

    public ResumeAnalysisResponseDTO(String summary, List<String> keySkills, List<String> suggestions) {
        this.summary = summary;
        this.keySkills = keySkills;
        this.suggestions = suggestions;
    }

    // Getters and Setters
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getKeySkills() {
        return keySkills;
    }

    public void setKeySkills(List<String> keySkills) {
        this.keySkills = keySkills;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }
}
