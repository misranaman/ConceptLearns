package interview_asks.common;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String p = "{{}}";
    }

    public static boolean isBalanced(String str) {
        char o1 = '{';
        char o2 = '[';
        char o3 = '(';
        char c1 = '}';
        char c2 = ']';
        char c3 = ')';

        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        int n = str.length();

        for (int i = 1; i < n; i++) {
            char currChar = str.charAt(i);
            if (currChar == o1 || currChar == o2 || currChar == o3) {
                stack.push(currChar);
                continue;
            }
            if (currChar == c1 || currChar == c2 || currChar == c3) {
                char topChar = stack.peek();
            }
        }

        return stack.isEmpty();
    }
}
