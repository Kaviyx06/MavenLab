package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App app = new App();

    // PASS 1: Normal lowercase input
    @Test
    public void testLowercaseVowels() {
        assertEquals(5, app.countVowels("education"));
    }

    // PASS 2: Uppercase input
    @Test
    public void testUppercaseVowels() {
        assertEquals(5, app.countVowels("AEIOU"));
    }

    // PASS 3: Mixed uppercase and lowercase
    @Test
    public void testMixedCase() {
        assertEquals(3, app.countVowels("Hello World"));
    }

    // PASS 4: String with no standard vowels
    @Test
    public void testNoVowels() {
        assertEquals(0, app.countVowels("rhythm"));
    }

    // PASS 5: Empty string
    @Test
    public void testEmptyString() {
        assertEquals(0, app.countVowels(""));
    }

    // PASS 6: Numbers and special characters
    @Test
    public void testNumbersAndSymbols() {
        assertEquals(2, app.countVowels("Java 21!"));
    }

    // PASS 7: Invalid null input
    @Test(expected = IllegalArgumentException.class)
    public void testNullInput() {
        app.countVowels(null);
    }
}
