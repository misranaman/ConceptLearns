package interview_asks.common;

import inhert.A;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        //groupAnagrams(arr);
        groupAnagramsTbd(arr);
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

    private static void groupAnagramsTbd(String[] arr) {
        int n = arr.length;
        List<List<String>> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String s : arr) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            set.add(new String(c));
        }

        for (String s : set) {
            List<String> temp = new ArrayList<>();
            for (String item : arr) {
                char[] iArr = item.toCharArray();
                Arrays.sort(iArr);
                if (new String(iArr).equals(s)) {
                    temp.add(item);
                }
            }
            res.add(temp);
        }

        System.out.println(res);
    }
}
