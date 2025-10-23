package interview_asks.companies.sprinklr;

import java.util.Arrays;

public class NonOverlappingInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};

        System.out.println(solution(intervals));
    }

    private static int solution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int c = 0;
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        System.out.println("sorted array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < end) {
                end = Math.min(arr[i][1], end);
                c++;
            } else {
                end = arr[i][1];
            }
        }
        return c;
    }
}
