package dsa_all_in_one.helpers;

public class MyArrays {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };

		printSubArrays(arr);

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

}
