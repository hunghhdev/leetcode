package dev.hunghh.leetcode.p00027;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    @DisplayName("Example 1")
    void example1() {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int expected = 2;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2")
    void example2() {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4 };
        int val = 2;
        int expected = 5;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3")
    void example3() {
        int[] nums = { 1, 1, 1, 1 };
        int val = 1;
        int expected = 0;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 4")
    void example4() {
        int[] nums = { 1 };
        int val = 1;
        int expected = 0;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 5")
    void example5() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int val = 2;
        int expected = 4;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 6")
    void example6() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int val = 6;
        int expected = 5;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 7")
    void example7() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int val = 0;
        int expected = 5;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 8")
    void example8() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int val = 1;
        int expected = 4;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 9")
    void example9() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int val = 5;
        int expected = 4;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 10")
    void example10() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int val = 2;
        int expected = 4;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    // ========== Test cases that verify ARRAY CONTENTS (like LeetCode judge)
    // ==========

    @Test
    @DisplayName("Verify array - consecutive vals at start")
    void verifyArray_consecutiveValsAtStart() {
        int[] nums = { 2, 2, 3 };
        int val = 2;
        int k = solution.removeElement(nums, val);

        assertEquals(1, k);
        for (int i = 0; i < k; i++) {
            assertNotEquals(val, nums[i], "Array still contains val at index " + i);
        }
    }

    @Test
    @DisplayName("Verify array - Example 1")
    void verifyArray_example1() {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int k = solution.removeElement(nums, val);

        assertEquals(2, k);
        for (int i = 0; i < k; i++) {
            assertNotEquals(val, nums[i], "Array still contains val at index " + i);
        }
    }

    @Test
    @DisplayName("Verify array - Example 2")
    void verifyArray_example2() {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int k = solution.removeElement(nums, val);

        assertEquals(5, k);
        for (int i = 0; i < k; i++) {
            assertNotEquals(val, nums[i], "Array still contains val at index " + i);
        }
    }
}
