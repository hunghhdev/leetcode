package dev.hunghh.leetcode.p00001;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    @DisplayName("Example 1: nums = [2,7,11,15], target = 9")
    void testExample1() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, solution.solve(nums, target));
    }

    @Test
    @DisplayName("Example 2: nums = [3,2,4], target = 6")
    void testExample2() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, solution.solve(nums, target));
    }

    @Test
    @DisplayName("Example 3: nums = [3,3], target = 6")
    void testExample3() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, solution.solve(nums, target));
    }
}
