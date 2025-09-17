package LeetCode.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Questions {
    public static void main(String[] args) {
        // String s = "abcabcbb";
        // System.out.println(lengthOfLongestSubstring(s));

        int[] nums1 = { 1, 5 };
        int[] nums2 = { 2, 4, 6, 8 };

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    // public static int lengthOfLongestSubstring(String s) {
    // int n = s.length();
    // int maxlength = 0;
    // int l = 0, r = 0;

    // for (int i = 0; i < n; i++) {

    // HashSet<Character> set = new HashSet<>();
    // for (int j = i; j < n; j++) {
    // if (set.contains(s.charAt(j))) {
    // break;
    // }
    // int len = j - i + 1;
    // maxlength = Math.max(maxlength, len);
    // set.add(s.charAt(j));
    // }
    // }
    // return maxlength;

    // HashMap<Character, Integer> map = new HashMap<>();
    // while (r < n) {
    // if (map.containsKey(s.charAt(r))) {
    // if (map.get(s.charAt(r)) >= l) {
    // l = map.get(s.charAt(r)) + 1;
    // }
    // }

    // int len = r - l + 1;
    // maxlength = Math.max(maxlength, len);
    // map.put(s.charAt(r), r);
    // r++;
    // }
    // return maxlength;
    // }

    // Brute Force Approach
    // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // if (nums1.length == 0 && nums2.length == 0) {
    // return 0;
    // }

    // int[] merged = new int[nums1.length + nums2.length];

    // int i = 0, j = 0, k = 0;

    // while (i < nums1.length && j < nums2.length) {
    // merged[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
    // }
    // while (i < nums1.length) {
    // merged[k++] = nums1[i++];
    // }
    // while (j < nums2.length) {
    // merged[k++] = nums2[j++];
    // }

    // int mid = merged.length / 2;
    // if (merged.length % 2 == 0) {
    // return (merged[mid - 1] + merged[mid]) / 2.0;
    // } else {
    // return merged[mid];
    // }
    // }

    // Binary Search Approach
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }

        int i = 0, j = 0;
        int n = nums1.length + nums2.length;
        int idx2 = n / 2;
        int idx1 = idx2 - 1;
        int count = 0;

        int idx1el = -1, idx2el = -1;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (count == idx1) {
                    idx1el = nums1[i];
                }
                if (count == idx2) {
                    idx2el = nums1[i];
                }
                count++;
                i++;
            } else {
                if (count == idx1) {
                    idx1el = nums2[j];
                }
                if (count == idx2) {
                    idx2el = nums2[j];
                }
                count++;
                j++;
            }
        }

        while (i < nums1.length) {
            if (count == idx1) {
                idx1el = nums1[i];
            }
            if (count == idx2) {
                idx2el = nums1[i];
            }
            count++;
            i++;
        }

        while (j < nums2.length) {
            if (count == idx1) {
                idx1el = nums2[j];
            }
            if (count == idx2) {
                idx2el = nums2[j];
            }
            count++;
            j++;
        }

        if (n % 2 == 1) {
            return idx2el;
        } else {
            return (double) ((double) (idx1el + idx2el)) / 2.0;
        }
    }

    // Longest palindrome substring
    // public static String longestPalindrome(String s) {
    // int n = s.length();
    // boolean[][] dp = new boolean[n][n];
    // int start = 0, maxLength = 1;
    // for (int i = 0; i < n; i++) {
    // dp[i][i] = true;
    // }
    // for (int i = 0; i < n - 1; i++) {
    // if (s.charAt(i) == s.charAt(i + 1)) {
    // dp[i][i + 1] = true;
    // start = i;
    // maxLength = 2;
    // }
    // }
    // for (int len = 3; len <=
    // n; len++) {





    
}
