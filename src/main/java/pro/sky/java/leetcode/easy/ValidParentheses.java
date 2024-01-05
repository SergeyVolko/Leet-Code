package pro.sky.java.leetcode.easy;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(
                ']', '[',
                '}', '{',
                ')', '('
        );
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                if (stack.empty() || stack.peek() != map.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }
}
