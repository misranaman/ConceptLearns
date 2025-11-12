package interview_asks.common;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String p = "()";
        if (isBalanced(p))
            System.out.println("Balanced");
        else
            System.out.println("Unbalanced");
    }

    public static boolean isBalanced(String str) {

        if (str.isEmpty())
            return false;

        char o1 = '{';
        char o2 = '[';
        char o3 = '(';
        char c1 = '}';
        char c2 = ']';
        char c3 = ')';

        String p1 = "{}";
        String p2 = "[]";
        String p3 = "()";

        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        int n = str.length();

        for (int i = 1; i < n; i++) {
            char currChar = str.charAt(i);
            String currCharStr = currChar + "";
            if (currChar == o1 || currChar == o2 || currChar == o3) {
                stack.push(currChar);
            } else if (currChar == c1 || currChar == c2 || currChar == c3) {
                char topChar = stack.peek();
                String topCharStr = topChar + "";
                if ((topCharStr + currCharStr).equals(p1)
                        || (topCharStr + currCharStr).equals(p2)
                        || (topCharStr + currCharStr).equals(p3))
                    stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
