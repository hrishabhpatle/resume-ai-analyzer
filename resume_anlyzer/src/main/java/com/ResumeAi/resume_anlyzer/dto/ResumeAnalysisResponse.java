package com.ResumeAi.resume_anlyzer.dto;
import java.util.List;
public class ResumeAnalysisResponse {
    private String summary;
    private List<String>KeySkills;
    private List<String> suggestions;

    public ResumeAnalysisResponse(){}

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getKeySkills() {
        return KeySkills;
    }

    public void setKeySkills(List<String> keySkills) {
        KeySkills = keySkills;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }

    public ResumeAnalysisResponse(String summary, List<String>KeySkills, List<String>suggestions){
        this.summary=summary;
        this.KeySkills=KeySkills;
        this.suggestions=suggestions;

    }

    public String getSummary() {
        return summary;
    }
}
