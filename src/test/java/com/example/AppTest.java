package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App app = new App();

    @Test
    public void testAddition() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testEvenOdd() {
        assertEquals("Even", app.evenOdd(4));
        assertEquals("Odd", app.evenOdd(7));
    }

    @Test
    public void testLargest() {
        assertEquals(9, app.largest(4, 9, 2));
    }

    @Test
    public void testFactorial() {
        assertEquals(120L, app.factorial(5));
        assertEquals(1L, app.factorial(0));
    }

    @Test
    public void testPrime() {
        assertTrue(app.isPrime(7));
        assertFalse(app.isPrime(8));
    }

    @Test
    public void testFibonacci() {
        assertArrayEquals(
            new int[]{0, 1, 1, 2, 3},
            app.fibonacci(5)
        );
    }

    @Test
    public void testReverseNumber() {
        assertEquals(321, app.reverseNumber(123));
    }

    @Test
    public void testNumberPalindrome() {
        assertTrue(app.isNumberPalindrome(121));
        assertFalse(app.isNumberPalindrome(123));
    }

    @Test
    public void testSimpleInterest() {
        assertEquals(200.0,
            app.simpleInterest(1000, 10, 2), 0.001);
    }

    @Test
    public void testGrade() {
        assertEquals("A", app.grade(95));
        assertEquals("F", app.grade(40));
    }

    @Test
    public void testArraySum() {
        assertEquals(10,
            app.arraySum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testArrayMaximum() {
        assertEquals(9,
            app.arrayMax(new int[]{4, 9, 2}));
    }

    @Test
    public void testCountVowels() {
        assertEquals(5, app.countVowels("education"));
    }

    @Test
    public void testReverseString() {
        assertEquals("olleh", app.reverseString("hello"));
    }

    @Test
    public void testStringPalindrome() {
        assertTrue(app.isStringPalindrome("Madam"));
        assertFalse(app.isStringPalindrome("Hello"));
    }
}