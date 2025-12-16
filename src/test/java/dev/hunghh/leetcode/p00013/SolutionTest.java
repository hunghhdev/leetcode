package dev.hunghh.leetcode.p00013;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    @DisplayName("Example 1: III -> 3")
    void testExample1() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    @DisplayName("Example 2: LVIII -> 58")
    void testExample2() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    @DisplayName("Example 3: MCMXCIV -> 1994")
    void testExample3() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    @DisplayName("Subtraction: IV -> 4")
    void testSubtractionIV() {
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    @DisplayName("Subtraction: IX -> 9")
    void testSubtractionIX() {
        assertEquals(9, solution.romanToInt("IX"));
    }

    @Test
    @DisplayName("Large Number: MMMCMXCIX -> 3999")
    void testMaxNumber() {
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }

    @Test
    @DisplayName("Single Numeral: D -> 500")
    void testSingleNumeral() {
        assertEquals(500, solution.romanToInt("D"));
    }

    @Test
    @DisplayName("Subtraction: XL -> 40")
    void testSubtractionXL() {
        assertEquals(40, solution.romanToInt("XL"));
    }

    @Test
    @DisplayName("Subtraction: XC -> 90")
    void testSubtractionXC() {
        assertEquals(90, solution.romanToInt("XC"));
    }

    @Test
    @DisplayName("Subtraction: CD -> 400")
    void testSubtractionCD() {
        assertEquals(400, solution.romanToInt("CD"));
    }

    @Test
    @DisplayName("Subtraction: CM -> 900")
    void testSubtractionCM() {
        assertEquals(900, solution.romanToInt("CM"));
    }

    @Test
    @DisplayName("Complex: MMXXI -> 2021")
    void testComplexDate() {
        assertEquals(2021, solution.romanToInt("MMXXI"));
    }
}
