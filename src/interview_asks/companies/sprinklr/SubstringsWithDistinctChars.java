package interview_asks.companies.sprinklr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringsWithDistinctChars {

    public static void main(String[] args) {
        solution("abc");
    }

    public static void solution(String str) {
        List<String> allSubStr = getAllSubstrings(str);
        if (allSubStr != null)
            for (String s : allSubStr) {
                if (isStringCharDistinct(s))
                    System.out.println(s);
            }
    }

    private static boolean isStringCharDistinct(String str) {
        Set<Character> s = new HashSet<>();
        char[] sArr = str.toCharArray();
        for (char c : sArr) {
            if (!s.add(c))
                return false;
        }
        return true;
    }

    private static List<String> getAllSubstrings(String str) {
        int n = str.length();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                res.add(str.substring(i, j));
            }
        }
        System.out.println("all substr:" + res);
        return res.isEmpty() ? null : res;
    }
}
