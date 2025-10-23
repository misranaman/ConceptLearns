package interview_asks.common;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings1 = {"flower", "flow", "flown"};
        String res = solution(strings1);
        System.out.println(res);
    }

    public static String solution(String[] strArr) {

        String prefix = strArr[0];

        int x = "string".indexOf("ri");

        for (int i = 1; i < strArr.length; i++) {
            while (strArr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}


