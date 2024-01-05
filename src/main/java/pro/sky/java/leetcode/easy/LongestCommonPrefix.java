package pro.sky.java.leetcode.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (String str : strs) {
                if (str.length() == i || str.charAt(i) != ch) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
            builder.append(ch);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix pr = new LongestCommonPrefix();
        System.out.println(pr.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }
}
