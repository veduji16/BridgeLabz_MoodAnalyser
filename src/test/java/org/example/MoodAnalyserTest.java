package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MoodAnalyserTest {
    @Test
    void returnSad() {
        MoodAnalyser mood_analyser = new MoodAnalyser();
        String result = mood_analyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", result);
    }

    @Test
    void returnHappy() {
        MoodAnalyser mood_analyser = new MoodAnalyser();
        String result = mood_analyser.analyseMood("I am in any mood");
        Assertions.assertEquals("HAPPY", result);
    }
}