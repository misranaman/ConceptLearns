package interview_asks.common;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        groupAnagrams(arr);
    }

    private static void groupAnagrams(String[] arr) {

        int n = arr.length;
        Set<String> set = new HashSet<>();
        List<List<String>> result = new ArrayList<>();

        for (String s : arr) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            set.add(new String(sArr));
        }

        for (String s : set) {
            List<String> temp = new ArrayList<>();
            for (String str : arr) {
                char[] sArr = str.toCharArray();
                Arrays.sort(sArr);
                if (s.equals(new String(sArr))) {
                    temp.add(str);
                }
            }
            result.add(temp);
        }

        System.out.println("groupAnagrams = " + result);
    }
}
