package org.example;

public class MoodAnalyser {
    private String mood;

    public MoodAnalyser() {
        this.mood = "";
    }

    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (mood == null || mood.isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY_OR_NULL_MOOD);
            } else if (mood.contains("sad")) {
                return "SAD";
            } else if (mood.contains("any")) {
                return "HAPPY";
            }
            return "";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisError.INVALID_MOOD);
        }
    }
}

class MoodAnalysisException extends Exception {
    public MoodAnalysisException(MoodAnalysisError error) {
        super(error.toString());
    }
}

enum MoodAnalysisError {
    EMPTY_OR_NULL_MOOD("Mood is null or empty."),
    INVALID_MOOD("Invalid mood.");

    private final String message;

    MoodAnalysisError(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
