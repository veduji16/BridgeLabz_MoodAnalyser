package org.example;

public class MoodAnalyser {
    private String mood;

    public MoodAnalyser() {
        this.mood = "";
    }

    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    public String analyseMood() {
        if (mood.contains("sad")) {
            return "SAD";
        } else if (mood.contains("any")) {
            return "HAPPY";
        }
        return "";
    }
}