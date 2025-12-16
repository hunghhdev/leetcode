package dev.hunghh.leetcode.p00014;

/**
 * LeetCode #14 - Longest Common Prefix
 * leetcode.com/problems/longest-common-prefix
 *
 * Description:
 * Write a function to find the longest common prefix string amongst an array of
 * strings. If there is no common prefix, return an empty string "".
 * 
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int prefixLen = 0;
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return strs[0].substring(0, prefixLen);
                }
            }
            prefixLen++;
        }

        return strs[0].substring(0, prefixLen);
    }
}
