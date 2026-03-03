package interview_asks.companies.greyorange;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String str = "(]h,te.([)<)]ysf%><ga(})";
        boolean isBal = isBalanced(str);
        System.out.println(isBal);
    }

    public static boolean isBalanced(String str) {
        char o1 = '[';
        char c1 = ']';
        char o2 = '{';
        char c2 = '}';
        char o3 = '(';
        char c3 = ')';
        String p1 = "[]";
        String p2 = "{}";
        String p3 = "()";

        String cleanString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == o1 || ch == c1 || ch == o2 || ch == c2 || ch == o3 || ch == c3) {
                cleanString = cleanString + ch;
            }
        }
        System.out.println("Clean String " + cleanString);

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < cleanString.length(); i++) {
            char ch = str.charAt(i);
            if (ch == o1 || ch == o2 || ch == o3) {
                st.push(ch);
            } else if (ch == c1 || ch == c2 || ch == c3) {
                char top = st.peek();
                String ch1 = ch + "";
                String top1 = top + "";
                String pair = ch1 + top1;
                if (pair.equals(p1) || pair.equals(p2) || pair.equals(p3)) {
                    st.pop();
                }
            }
        }

        return st.isEmpty();
    }

}
