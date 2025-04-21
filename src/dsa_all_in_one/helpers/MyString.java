package dsa_all_in_one.helpers;

import java.util.ArrayList;
import java.util.List;

public class MyString {

	public static void main(String[] args) {

		getAndPrintAllSubsStrings("abc");

	}

	public static List<String> getAndPrintAllSubsStrings(String str) {

		int n = str.length();
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j <= n; j++) {
				res.add(str.substring(i, j));
			}
		}

		System.out.println("Substring of " + str + " is");
		res.forEach(s -> System.out.println(s));
		return res;

	}

}
