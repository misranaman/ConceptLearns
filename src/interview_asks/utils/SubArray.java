package interview_asks.utils;

public class SubArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 9};
        getAllSubArrays(arr);
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
}
