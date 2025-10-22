package interview_asks.common;

import com.sun.source.tree.NewArrayTree;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithOutRepeatingChar {

    public static void main(String[] args) {

        String input1 = "ABCDEFGABEF";
        String input2 = "GEEKSFORGEEKS";
        System.out.println("Longest substring is:" + longestUniqueSubStringMap(input2));
        System.out.println("Longest substring is:" + longestUniqueSubString(input2));
    }

    public static int longestUniqueSubStringMap(String str) {

        int res = 0;
        int n = str.length();
        int i = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {

            if (map.containsKey(str.charAt(j))) {
                i = Math.max(i, map.get(str.charAt(j)) + 1);
            }

            res = Math.max(res, j - i + 1);
            map.put(str.charAt(j), j);
        }
        return res;
    }

    private static int longestUniqueSubString(String str) {

        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {

                if (visited[str.charAt(j)]) {
                    break;
                }

                visited[str.charAt(j)] = true;
                res = Math.max(res, j - i + 1);
            }
        }

        return res;
    }
}
