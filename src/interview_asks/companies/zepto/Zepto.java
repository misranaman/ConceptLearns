package interview_asks.companies.zepto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zepto {

	// String s="abab jki ababababab oki abababababab axcvvbv abab v ab", target
	// ="ab" , output=[2,5,1]

	public static void main(String[] args) {

		// solution("abXababXabababXababababXabab", "ab");
		// solution("abXababXabababXababababXababXab", "ab");
		// String sol2Res = solution2("I Love Zepto");
		// System.out.println(sol2Res);
		findTargetOccurrences("abXababXabababXababababXababXabab", "ab");

	}

	public static void solution(String str, String tar) {

		List<Integer> res = new ArrayList<>();
		String temp = "";
		int n = str.length();
		int m = tar.length();
		int counter = 0;
		int mCounter = 0; // total appearance of target string will be stored

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			temp = temp + ch;
			if (temp.contains(tar)) {
				temp = "";
				counter++;
				mCounter++;
			} else if (temp.length() >= m && !temp.contains(tar)) { // in case of 3 char checked and there is no match
																	// for target.
				res.add(counter);
				counter = 0;
			}
		}

		// in case there are more than 1 matches in the last
		if (counter >= 1) {
			res.add(counter);
			counter = 0;
		}

		// special case for handling last match
		if (counter == 0 && str.substring(str.length() - m)
				.equals(tar)) {
			counter++;
			res.add(counter);
		}

		// if both of above case are true we have to remove the last element as it will
		// be duplicate
		res = res.stream()
				.filter(r -> r != 0)
				.collect(Collectors.toList());
		int sum = 0;
		for (int x : res)
			sum = sum + x;

		if (sum != mCounter) {
			res.remove(res.size() - 1);
		}
		System.out.println(res);
	}

	public static List<Integer> findTargetOccurrences(String s, String target) {
		List<Integer> result = new ArrayList<>();
		int count = 0;
		int i = 0;

		while (i < s.length()) {
			if (s.startsWith(target, i)) {
				count++;
				i += target.length();
			} else {
				if (count > 0) {
					result.add(count);
					count = 0;
				}
				i++;
			}
		}

		if (count > 0) {
			result.add(count);
		}

		System.out.println(result);
		return result;
	}

	// String s="I Love Zepto" //o tpeZ evoLI
	public static String solution2(String str) {

		char arr[] = str.toCharArray();
		int n = arr.length;

		int left = 0;
		int right = n - 1;

		while (left < right) {

			if (arr[left] != ' ' && arr[right] != ' ') {

				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;

			} else if (arr[left] == ' ' && arr[right] != ' ') {
				left++;
			} else if (arr[right] == ' ' && arr[left] != ' ') {
				right--;
			}

		}

		return new String(arr);
	}

}
