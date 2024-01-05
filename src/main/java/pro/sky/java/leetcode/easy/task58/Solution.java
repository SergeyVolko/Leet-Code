package pro.sky.java.leetcode.easy.task58;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

    public int lengthOfLastWord2(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                continue;
            }
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord2(s));
    }
}
