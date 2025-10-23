package interview_asks.common;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 0, 3, 9};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] solution(int[] arr) {
        int n = arr.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int t = arr[i];
                arr[i] = arr[c];
                arr[c] = t;
                c++;
            }
        }
        return arr;
    }
}
