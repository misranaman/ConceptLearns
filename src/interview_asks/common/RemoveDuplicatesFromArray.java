package interview_asks.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public RemoveDuplicatesFromArray() {

    }


    public static void solution1(int[] a, int[] b) {

        List<Integer> result = new ArrayList<>();

        for (int i : a) {
            result.add(i);
        }

        for (int j : b) {
            if (result.contains(j)) {
                result.remove(j);
            }
        }

        Set<Integer> resultSet = new HashSet<>(result);

        System.out.println(resultSet);
    }

    public static boolean solution2(String str) {

        char[] arr = str.toCharArray();
        int rCount = 0;
        int gCount = 0;
        int bCount = 0;

        for (char ch : arr) {

            switch (ch) {

                case 'R':
                    rCount++;
                    break;
                case 'G':
                    gCount++;
                    break;
                case 'B':
                    bCount++;
            }
        }

        return rCount % 2 == 0 && bCount % 2 == 0 && gCount % 2 == 0;
    }

    public static float[][] solution3(float[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        if (m == 0)
            return new float[0][0];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                float num = arr[i][j];
                float v;
                if ((i == 0 && j == 0) || (i == 0 && j == m - 1) || (i == n - 1 && j == 0) || i == n - 1 && j == m - 1) {

                    v = num / 2;
                } else {

                    v = num * 2;
                }
                arr[i][j] = v;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] a = {4, 2, 7, 4, 9, 1, 3};
        int[] b = {2, 5, 7, 1};

        //solution1(a, b);
        boolean v = solution2("RGRBRG");
        System.out.println(v);

    }
}
