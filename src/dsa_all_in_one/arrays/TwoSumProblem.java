package dsa_all_in_one.arrays;

import java.util.Arrays;

public class TwoSumProblem {

	/*
	 * Given an array arr[] of n integers and a target value, the task is to find
	 * whether there is a pair of elements in the array whose sum is equal to
	 * target. This problem is a variation of 2Sum problem.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = [0, -1, 2, -3, 1], target = -2 Output: true Explanation: There
	 * is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
	 * 
	 * 
	 * Input: arr[] = [1, -2, 1, 0, 5], target = 0 Output: false Explanation: There
	 * is no pair with sum equals to given target.
	 */

	public static void main(String[] args) {

		int[] arr = { 0, -1, 2, -3, 1 };

		boolean res = isTwoSum(arr, 100);
		
		System.out.println(res);
	}

	public static boolean isTwoSum(int[] arr, int tgt) {

		iSort(arr);

		int left = 0;
		int right = arr.length-1;

		while (left < right) {

			if (arr[left] + arr[right] > tgt) {
				right--;
			} else if (arr[left] + arr[right] < tgt) {
				left++;
			} else {
				return true;
			}

		}

		return false;
	}

	public static void iSort(int[] arr) {

		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int j = i - 1;
			int key = arr[i];

			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}

			arr[j+1] = key;
		}

		System.out.println("sorter array is " + Arrays.toString(arr));

	}

}
