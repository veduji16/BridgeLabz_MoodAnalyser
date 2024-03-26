package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MoodAnalyserTest {
    MoodAnalyserTest() {
    }

    @Test
    void returnSad() throws MoodAnalysisException {
        MoodAnalyser mood_analyser = new MoodAnalyser("I am in sad mood");
        String result = mood_analyser.analyseMood();
        Assertions.assertEquals("SAD", result);
    }

    @Test
    void returnHappy() throws MoodAnalysisException {
        MoodAnalyser mood_analyser = new MoodAnalyser("I am in any mood");
        String result = mood_analyser.analyseMood();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    public void givenInvalidMood_ShouldThrowException() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals("Mood is null or empty.", e.getMessage());
        }
    }

    @Test
    public void givenNullMood_shouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals("Mood is null or empty.", e.getMessage());
        }
    }

    @Test
    public void givenEmptyMood_shouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals("Mood is null or empty.", e.getMessage());
        }
    }

}
