package com.example;

public class App {

    // Q1. Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Q2. Check even or odd
    public String evenOdd(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    // Q3. Largest of three numbers
    public int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Q4. Factorial (valid for 0 to 20)
    public long factorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Enter 0 to 20");

        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    // Q5. Check prime number
    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Q6. Generate Fibonacci series
    public int[] fibonacci(int count) {
        if (count < 0)
            throw new IllegalArgumentException("Invalid count");

        int[] series = new int[count];
        if (count > 0) series[0] = 0;
        if (count > 1) series[1] = 1;

        for (int i = 2; i < count; i++)
            series[i] = series[i - 1] + series[i - 2];

        return series;
    }

    // Q7. Reverse a number
    public int reverseNumber(int n) {
        long value = Math.abs((long) n);
        long reversed = 0;

        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }

        if (n < 0) reversed = -reversed;
        if (reversed < Integer.MIN_VALUE ||
            reversed > Integer.MAX_VALUE)
            throw new ArithmeticException("Overflow");

        return (int) reversed;
    }

    // Q8. Check number palindrome
    public boolean isNumberPalindrome(int n) {
        return n >= 0 && n == reverseNumber(n);
    }

    // Q9. Calculate simple interest
    public double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }

    // Q10. Calculate grade based on marks
    public String grade(int marks) {
        if (marks < 0 || marks > 100)
            throw new IllegalArgumentException("Invalid marks");

        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }

    // Q11. Sum of array elements
    public int arraySum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    // Q12. Maximum element in an array
    public int arrayMax(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array is empty");

        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }

    // Q13. Count vowels in a string
    public int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }
        return count;
    }

    // Q14. Reverse a string
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Q15. Check string palindrome (ignores case)
    public boolean isStringPalindrome(String s) {
        return s.equalsIgnoreCase(reverseString(s));
    }
}
