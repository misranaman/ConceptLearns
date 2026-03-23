package interview_asks.companies.greyorange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GreyOrangeR2 {
    public static void main(String[] args) {
        //[2,4,6,7,8], k=1
        int[] arr = {2, 4, 6, 7, 8};
        //boolean b = isSumPresent(arr, 1);
        boolean b = isSumPresent(arr, 21, 3);
//        String ip1 = "aabbcccdddeee";
//        boolean b = isValidString(ip1);

        System.out.println(b);

        //abcde //aabbcc //aabbc
    }

    private static boolean isSumPresent(int[] arr, int k) {
        Arrays.sort(arr);
        int right = arr.length - 1;
        int left = 0;

        while (left < right) {
            if (arr[left] + arr[right] > k) {
                right--;
            } else if (arr[left] + arr[right] < k) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean isSumPresent(int[] arr, int k, int w) {
        int n = arr.length;
        int currSum = 0;
        for (int i = 0; i < w; i++) {
            currSum += arr[i];
        }

        if (currSum == k)
            return true;

        for (int i = w; i <= n; i++) {
            System.out.println("current sum:" + currSum);
            System.out.println("number to be deleted:" + arr[i - w]);
            System.out.println("number to be added:" + arr[w]);
            currSum = currSum + arr[w] - arr[i - w];
            System.out.println("new currSum:" + currSum);
            if (currSum == k)
                return true;
        }
        return false;
    }

    private static boolean isValidString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char firstChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int val = map.get(firstChar);
        boolean pass = false;
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() - val == 1 && !pass) {
                pass = true;
                continue;
            }
            if (m.getValue() != val)
                return false;
        }
        return true;
    }

    /*
    25 total horses
    5 horses can race at a time
    5,5,5,5,5
    1,1,1,1,1
     */
}
