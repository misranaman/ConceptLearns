package interview_asks.companies.zepto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {

		int arr[][] = { { 1, 3 }, { 2, 4 }, { 6, 8 }, { 9, 10 } };

		List<int[]> resList = mergeOverlap(arr);
		System.out.println();

		resList = mergeOverlap(arr);

		System.out.println("------result-----");

		for (int[] x : resList) {
			System.out.println();
			for (int i : x) {
				System.out.print(i + " , ");
			}
		}

	}

	public static List<int[]> mergeOverlap(int[][] arr) {

		int n = arr.length;

		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
		printDDArray(arr, "----After sort step-----");

		List<int[]> result = new ArrayList<>();

		result.add(new int[] { arr[0][0], arr[0][1] });

		for (int i = 1; i < n; i++) {

			int last[] = result.get(result.size() - 1);
			int curr[] = arr[i];

			if (curr[0] < last[1]) {
				last[1] = Math.max(curr[1], last[1]);
			} else {
				result.add(curr);
			}

		}

		return result;

	}

	private static List<int[]> mergeOverlapMySol(int arr[][]) {

		List<int[]> res = new ArrayList<int[]>();
		int n = arr.length;
		int m = arr[0].length;
		for (int i = 1; i < n; i++) {
			int[] curr = arr[i];
			int[] prev = arr[i - 1];

			if (curr[1] > prev[1] &&
					curr[0] < prev[1]) {
				res.add(new int[] { prev[0], curr[1] });
			} else {
				res.add(curr);
			}
		}

		return res;
	}

	private static void printDDArray(int[][] arr, String message) {

		System.out.println(message);

		int l = arr.length;
		int w = arr[0].length;

		for (int i = 0; i < l; i++) {

			if (i > 0) {
				System.out.println();
			}

			for (int j = 0; j < w; j++) {
				if (j != w - 1)
					System.out.print(arr[i][j] + " , ");
				else
					System.out.print(arr[i][j]);
			}
		}
	}
}
