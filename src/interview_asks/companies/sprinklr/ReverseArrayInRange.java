package interview_asks.companies.sprinklr;

public class ReverseArrayInRange {

    //[5:19 PM] Arun Gupta
    //{2, 23, 4, 11, 10, 22, 89, 80, 3, 1}
    //2, 6

    public static void main(String[] args) {
        int[] arr = {0,2, 23, 4, 11, 10, 22, 89, 80, 3, 1,100};

        reverse(arr, 2, 6);
    }


    public static void reverse(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i : arr)
            System.out.print(i+" ");
    }
}
