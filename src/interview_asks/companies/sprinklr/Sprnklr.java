package interview_asks.companies.sprinklr;

import java.util.ArrayList;
import java.util.List;

public class Sprnklr {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1};
        count(arr, 2);
    }

    public static void count(int[] arr, int window) {

        int count = 0;
        //int[] myWin = new int[3];
        List<Integer> myWin = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < window; i++) {
            myWin.add(arr[i]);
        }

        if (allOnes(myWin))
            count++;

        for (int i = window; i < n; i++) {
            myWin.remove(0);
            myWin.add(arr[i]);
            if (allOnes(myWin))
                count++;
        }

        System.out.println(count);
    }
    
    public static boolean allOnes(List<Integer> arr) {
        for (int i : arr)
            if (i != 1)
                return false;
        return true;
    }


    public static void countOnes(int[] arr, int x) {
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n - x; i++) {
            int j = i;
            int t = x;
            while (t > 0 && arr[j] == 1) {
                t--;
                j++;
            }

            if (j == x)
                count++;
        }

        System.out.println(count);
    }
}