package interview_asks.utils;

import inhert.A;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 9};
        allSa(arr);
       // getAllSubArrays(arr);
    }

    public static void getAllSubArrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static List<List<Integer>> allSa(int arr[]) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> t = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    t.add(arr[k]);
                }
                res.add(t);
            }

        }

        for (List<Integer> l : res) {
            for (int i : l) {
                System.out.print(i);
            }
            System.out.println();
        }
        return res;
    }
}
