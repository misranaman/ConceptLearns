package interview_asks.common;

import java.util.Arrays;

public class SolutionMultiple {

    public static void main(String[] args) {

        //multiply(39);//==>39->27->14->4,//12->1

        //insertionSort(new int[]{5, 4, 3, 2, 1});

        //System.out.println(ReportProblem.REPORT_A_BUG.problem());
        fibonacciSeries();
    }

    public static void multiply(int n) {

        int prod = 1;
        int c = 1;
        while (n > 0 || prod > 9) {
            if (n == 0) {
                c++;
                n = prod;
                prod = 1;
            }
            prod = prod * (n % 10);
            n = n / 10;
        }
        System.out.println(c);
    }

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void fibonacciSeries() {
        int a = 0;
        int b = 1;
        int n = 7;
        System.out.println(a + " ");
        System.out.println(b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }

}
