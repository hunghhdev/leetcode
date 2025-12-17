package dev.hunghh.leetcode.p00026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    @DisplayName("Example 1: [1,1,2] -> k=2, nums=[1,2,_]")
    void testExample1() {
        int[] nums = { 1, 1, 2 };
        int k = solution.removeDuplicates(nums);
        assertEquals(2, k);
        assertArrayEquals(new int[] { 1, 2 }, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    @DisplayName("Example 2: [0,0,1,1,1,2,2,3,3,4] -> k=5, nums=[0,1,2,3,4,_,_,_,_,_]")
    void testExample2() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    @DisplayName("Single element: [1] -> k=1")
    void testSingleElement() {
        int[] nums = { 1 };
        int k = solution.removeDuplicates(nums);
        assertEquals(1, k);
        assertArrayEquals(new int[] { 1 }, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    @DisplayName("All same elements: [2,2,2,2] -> k=1")
    void testAllSame() {
        int[] nums = { 2, 2, 2, 2 };
        int k = solution.removeDuplicates(nums);
        assertEquals(1, k);
        assertArrayEquals(new int[] { 2 }, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    @DisplayName("No duplicates: [1,2,3,4,5] -> k=5")
    void testNoDuplicates() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    @DisplayName("Negative numbers: [-3,-1,-1,0,0,2] -> k=4")
    void testNegativeNumbers() {
        int[] nums = { -3, -1, -1, 0, 0, 2 };
        int k = solution.removeDuplicates(nums);
        assertEquals(4, k);
        assertArrayEquals(new int[] { -3, -1, 0, 2 }, java.util.Arrays.copyOf(nums, k));
    }
}
