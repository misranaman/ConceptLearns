package dsa_all_in_one.arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7, 9, 10 };
		int b[] = { 2, 4, 6, 8, 10, 11 };
		
		mergeSorted(a, b);
	}

	public static void mergeSorted(int a[], int b[]) {

		int n = a.length;
		int m = b.length;

		int i = 0;
		int j = 0;

		while (i < n && j < m) {
			if (a[i] < b[j]) {
				System.out.print(a[i] + " ");
				i++;
			} else if (b[j] < a[i]) {
				System.out.print(b[j] + " ");
				j++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}

		while (i < n) {
			System.out.print(a[i] + " ");
			i++;
		}
		while (j < m) {
			System.out.print(b[j] + " ");
			j++;
		}
	}
}
