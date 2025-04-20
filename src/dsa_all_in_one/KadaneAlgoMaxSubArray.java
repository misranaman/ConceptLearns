package dsa_all_in_one;

public class KadaneAlgoMaxSubArray {

	// Kadane’s Algorithm (Maximum Subarray Sum).
	/***
	 * 
	 * Given an array arr[], the task is to find the subarray that has the maximum
	 * sum and return its sum.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = {2, 3, -8, 7, -1, 2, 3} Output: 11 Explanation: The subarray
	 * {7, -1, 2, 3} has the largest sum 11.
	 * 
	 * 
	 * Input: arr[] = {-2, -4} Output: –2 Explanation: The subarray {-2} has the
	 * largest sum -2.
	 * 
	 * 
	 * Input: arr[] = {5, 4, 1, 7, 8} Output: 25 Explanation: The subarray {5, 4, 1,
	 * 7, 8} has the largest sum 25.
	 ***/

	public static void main(String[] args) {

	}

	public static int maxSubArray(int[] arr) {

		int res = arr[0];
		int maxEnding = arr[0];

		for (int i = 0; i < arr.length; i++) {
			maxEnding = Math.max(arr[i], maxEnding + arr[i]);
			res = Math.max(res, maxEnding);
		}

		return res;
	}

}
