package interview_asks;

public class SubsString {

	public static void main(String[] args) {
		
		getAllSubsStrings("abcdef");

	}

	public static void getAllSubsStrings(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
