package pro.sky.java.leetcode.easy.task35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
               return mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, target));

        int target2 = 5;
        System.out.println(solution.searchInsert(nums, target2));

        int target3 = 2;
        System.out.println(solution.searchInsert(nums, target3));

        int[] nums2 = {1};
        int target4 = 1;
        System.out.println(solution.searchInsert(nums2, target4));

        int[] nums3 = {1, 3};
        int target5 = 2;
        System.out.println(solution.searchInsert(nums3, target5));
    }
}
