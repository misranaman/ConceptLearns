package dsa_all_in_one.arrays;

//Find the missing number in an array of 1 to N.

public class MissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6 };

		int missingNum = missingNumber(arr);

		System.out.println(missingNum);

	}

	public static int missingNumber(int[] arr) {

		int n = arr[arr.length - 1];

		int actualSum = 0;

		int expectedSum = (n * (n + 1)) / 2;

		for (int i : arr)
			actualSum = actualSum + i;

		int missingNum = expectedSum - actualSum;

		return missingNum;
	}

}
