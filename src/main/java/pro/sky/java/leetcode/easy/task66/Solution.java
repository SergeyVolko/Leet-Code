package pro.sky.java.leetcode.easy.task66;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        for (int i = index; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4,3,2,1,9,9,9};
        System.out.println(Arrays.toString(solution.plusOne(arr)));
    }
}
