package interview_asks.common;

public class CompareStringArrayEquality {
    public static void main(String[] args) {
        boolean val = solution(new String[]{"tab", "bat", "tan"}, new String[]{"tab", "tan", "bat"});
        System.out.println("String equality: " + val);
    }

    public static boolean solution(String[] str1, String[] str2) {
        boolean flag = false;
        for (int i = 0; i < str1.length; i++) {
            flag = false;
            String curr = str1[i];
            for (int j = 0; j < str2.length; j++) {
                String now = str2[j];
                System.out.println("Comparing " + curr + " with " + now);
                if (curr.equals(now)) {
                    flag = true;
                    break;
                } else {
                    System.out.println(curr + " is not equal to " + now);
                }
            }
            if (!flag)
                return false;
        }
        return flag;
    }
}
