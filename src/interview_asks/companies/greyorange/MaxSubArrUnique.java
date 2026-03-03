package interview_asks.companies.greyorange;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    //{1, 3, 5, 2, 4, 6, 9}

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 4, 6, 9};
        int maxL = maxLengthSubArr(arr);
        System.out.print(maxL);
    }

    public static int maxLengthSubArr(int[] arr) {
        List<List<Integer>> subArrayList = getAllSubArrays(arr);
        int maxLen = 0;
        for (List<Integer> ar : subArrayList) {
            Set<Integer> set = new HashSet<>();
            for (int item : ar) {
                if (!set.add(item)) {
                    continue;
                }
            }
            maxLen = Math.max(ar.size(), maxLen);
        }
        return maxLen;
    }

    public static List<List<Integer>> getAllSubArrays(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> temp = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    temp.add(arr[k]);
                }
                res.add(temp);
            }
        }
        System.out.println("All Sub Arrays");
        for (List<Integer> l : res) {
            System.out.println(l);
        }
        return res;
    }
}
