package dev.hunghh.leetcode.p00027;

/**
 * LeetCode #27 - Remove Element
 * leetcode.com/problems/remove-element
 *
 * Description:
 * Given an integer array nums and an integer val, remove all occurrences of val
 * in nums in-place. The relative order of the elements may be changed.
 *
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int point = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[point] = nums[i];
                point++;
            }
        }
        return point;
    }
}
