package dsa_all_in_one.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrays {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };

		//printSubArrays(arr);
		getAllSubArray(arr);

	}

	public static void printSubArrays(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				for (int k = i; k <= j; k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}

	public static List<List<Integer>> getAllSubArray(int[] arr) {

		int n = arr.length;
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				List<Integer> temp = new ArrayList<Integer>();
				for (int k = i; k <= j; k++) {
					temp.add(k);
				}

				result.add(temp);
			}

		}

		System.out.println("all sub arrays of " + Arrays.toString(arr));

		result.forEach(l -> {
			System.out.println(l);
		});
		
		return result;
	}

}
