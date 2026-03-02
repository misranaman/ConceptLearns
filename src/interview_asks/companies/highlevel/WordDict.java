package interview_asks.companies.highlevel;

import java.util.List;

public class WordDict {

    public static void main(String[] args) {
        //boolean res = wordDictSolution("catsandog", List.of("cats", "dog", "sand", "and", "cat"));
        boolean res = wordDictSolution("leetcode", List.of("leet", "code"));
        //boolean res = wordDictSolution("applepenapple", List.of("apple", "pen"));
        System.out.println(res);
    }

    public static boolean wordDictSolution(String str, List<String> wordDict) {
        boolean res = true;
        while (!str.isEmpty()) {
            for (String word : wordDict) {
                if (str.length() < word.length()) {
                    res = false;
                    str = "";
                    break;
                }
                for (int i = 0; i < word.length(); i++) {
                    char c1 = word.charAt(i);
                    char c2 = str.charAt(i);
                    if (c1 != c2) {
                        res = false;
                        break;
                    }
                }
                str = str.replace(word, "");

            }
        }
        return res;
    }
}
