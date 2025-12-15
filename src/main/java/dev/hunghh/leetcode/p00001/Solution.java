package dev.hunghh.leetcode.p00001;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #1 - Two Sum
 * leetcode.com/problems/two-sum
 *
 * Description:
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 */
public class Solution {

    public int[] solve(int[] nums, int target) {
        System.gc(); // LeetCode memory optimization trick
        Map<Integer, Integer> maps = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int x = target - nums[i];
            if (maps.containsKey(x)) {
                return new int[] { maps.get(x), i };
            }
            maps.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

    /*
     * User's note (Alternative Approach):
     * System.gc();
     * Map<Integer, Integer> maps = new HashMap<>();
     * int len = nums.length;
     * for(int i =1; i< len; i++){
     * for(int j=i; j < len;j++){
     * if((nums[j]+nums[j-i] ) == target){
     * return new int[]{j,j-i};
     * }
     * }
     * }
     *
     * throw new IllegalArgumentException("No solution");
     */
}
