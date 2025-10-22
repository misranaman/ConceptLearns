package interview_asks.common;

public class CloseSumInSortedArray {

    public static void main(String[] args) {

        closeSum(new int[]{2, 3, 5, 6, 8, 9, 30}, 20);
    }

    private static void closeSum(int[] arr, int num) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;
        int diff = Integer.MAX_VALUE;
        int resLeft = 0;
        int resRight = 0;

        while (left < right) {

            if (Math.abs(arr[left] + arr[right] - num) < diff) {
                resLeft = left;
                resRight = right;
                diff = Math.abs(arr[left] + arr[right] - num);
            }

            if (arr[left] + arr[right] > num) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println("diff is " + diff);
        System.out.println("sum with min pair is " + resLeft + "," + resRight);
    }

}
