package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MoodAnalyserTest {
    @Test
    void returnSad() {
        MoodAnalyser mood_analyser = new MoodAnalyser("I am in sad mood");
        String result = mood_analyser.analyseMood();
        Assertions.assertEquals("SAD", result);
    }
}