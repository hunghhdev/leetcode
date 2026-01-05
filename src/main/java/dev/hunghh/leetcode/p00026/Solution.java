package dev.hunghh.leetcode.p00026;

/**
 * LeetCode #26 - Remove Duplicates from Sorted Array
 * leetcode.com/problems/remove-duplicates-from-sorted-array
 *
 * Description:
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same.
 *
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int j = 0;
        for (int i = 1; i < len; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
