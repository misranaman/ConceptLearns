package interview_asks.common;

public class ReverseStringWithSpaceIntact {

    public static void main(String[] args) {

        //String ip="xyz de";
        String ip="today is monday";

        solution(ip);

    }


    private static void solution(String str) {

        int n = str.length();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (arr[left] != ' ' && arr[right] != ' ') {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            } else if (arr[left] == ' ' && arr[right] != ' ') {
                left++;
            } else if (arr[right] == ' ' && arr[left] != ' ') {
                right--;
            }
        }

        System.out.println(new String(arr));
    }
}
