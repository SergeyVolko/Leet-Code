package pro.sky.java.leetcode.easy.task17;

import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
