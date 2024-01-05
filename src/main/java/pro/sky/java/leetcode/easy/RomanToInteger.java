package pro.sky.java.leetcode.easy;

import java.util.Map;

public class RomanToInteger {
    private static Map<String, Integer> map = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );

    public static int romanToInt(String s) {
        int result = 0;
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && map.get(arr[i]) < map.get(arr[i + 1])) {
                result -= map.get(arr[i]);
            } else {
                result += map.get(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
