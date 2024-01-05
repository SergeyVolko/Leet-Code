package pro.sky.java.leetcode.easy.task28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int strStr(String haystack, String needle) {
        Pattern pattern = Pattern.compile(needle);
        Matcher matcher = pattern.matcher(haystack);
        if (matcher.find()) {
            return matcher.start();
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength > haystackLength) {
            return -1;
        }
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j = 0;
            while (j != needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        Solution solution = new Solution();
        System.out.println(solution.strStr(haystack, needle));
    }
}
