package interview_asks.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubsString {

	public static void main(String[] args) {

		getAllSubsStrings("str");

		// longestNonRepeatingSubsString("abcdabcdg");

	}

	public static void getAllSubsStrings(String str) {

		// number of substrings in a string is (n*(n+)/2)
		// this is similar to number of sub arrays in a an array

		int n = str.length();
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(str.substring(i, j));
				c++;
			}
		}

		System.out.println("total subs-strings of " + str + "(" + str.length() + ")" + " is " + c);
	}

	public static List<String> getAllSubsStringList(String str) {
		int n = str.length();
		List<String> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				l.add(str.substring(i, j));
				// System.out.println(str.substring(i, j));
			}
		}

		return l;
	}

	public static void longestNonRepeatingSubsString(String str) {

		int maxLenght = 0;

		List<String> subStrList = getAllSubsStringList(str);
		subStrList = subStrList
			.stream()
			.filter(s -> isUniqueCharString(s))
			.collect(Collectors.toList());
		for (String s : subStrList) {
			maxLenght = Math.max(maxLenght, s.length());
		}

		System.out.println("max length " + maxLenght);

	}

	public static boolean isUniqueCharString(String str) {

		char[] arr = str.toCharArray();
		Set<Character> set = new HashSet<>();

		for (char c : arr) {
			if (!set.add(c)) {
				return false;
			}
		}

		return true;
	}

}
