package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MoodAnalyserTest {
    MoodAnalyserTest() {
    }

    @Test
    void returnSad() {
        MoodAnalyser mood_analyser = new MoodAnalyser("I am in sad mood");
        String result = mood_analyser.analyseMood();
        Assertions.assertEquals("SAD", result);
    }

    @Test
    void returnHappy() {
        MoodAnalyser mood_analyser = new MoodAnalyser("I am in any mood");
        String result = mood_analyser.analyseMood();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        assertEquals("INVALID", mood);
    }
}
