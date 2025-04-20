package dsa_all_in_one.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Union with Duplicates
 * 
 * Input : a[] = {1, 2, 3, 2, 1}, b[] = {3, 2, 2, 3, 3, 2} Output : {3, 2, 1}
 * Explanation: Each element in the output either belongs to array a or array b,
 * and we need to print only one occurrence of such elements.
 * 
 * 
 * Input : a[] = {1, 2, 3}, b[] = {4, 5, 6} Output : {1, 2, 3, 4, 5, 6}
 * Explanation: Each element in the output either belongs to array a or array b,
 * and we need to print only one occurrence of such elements.
 *
 *
 *
 * Input: a[] = {1, 2, 1, 3, 1}, b[] = {3, 1, 3, 4, 1} Output: {1, 3}
 * Explanation: 1 and 3 are the only common elements and we need to print only
 * one occurrence of common elements.
 * 
 * Intersection with Duplicates
 *
 * Input: a[] = {1, 2, 3}, b[] = {4, 5, 6} Output: {} Explanation: No common
 * element in both the arrays.
 *
 */

public class IntersectionUnionArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2, 1 };
		// int b[] = { 3, 2, 2, 3, 3, 2 };
		int b[] = { 3, 1, 4 };
		// unionArr(a, b);
		intersectionArray(a, b);

	}

	public static void unionArr(int[] a, int[] b) {

		Set<Integer> hashSet = new LinkedHashSet<>();

		for (int i : a)
			hashSet.add(i);
		for (int i : b)
			hashSet.add(i);

		System.out.println("Union of 2 arrays is :" + hashSet);

	}

	public static void intersectionArray(int[] a, int[] b) {

		Set<Integer> hashSet = new LinkedHashSet<>();
		Set<Integer> res = new LinkedHashSet<>();

		for (int i : a)
			hashSet.add(i);
		for (int i : b) {
			if (!hashSet.add(i)) {
				hashSet.remove(i);
				res.add(i);
			}
		}

		System.out.println("intersection of array is " + res);
	}
}
