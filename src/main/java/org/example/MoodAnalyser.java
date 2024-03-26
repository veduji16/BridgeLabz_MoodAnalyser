package org.example;
public class MoodAnalyser {
    public String analyseMood(String mood) {
        if (mood.contains("sad")) {
            return "SAD";
        } else if (mood.contains("happy")) {
            return "HAPPY";
        }
        return "";
    }
}