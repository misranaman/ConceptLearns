package interview_asks.companies;

import java.util.Stack;

public class LargestHistogramArea {

	public static void main(String[] args) {

		int[] hist = { 60, 20, 50, 40, 10, 50, 60 };
		// nextSmaller(hist);

		// prevSmaller(hist);

		getMaxArea(hist);

	}

	public static int largestArea(int hist[]) {

		return 0;
	}

	public static int[] nextSmaller(int hist[]) {

		int n = hist.length;
		int nextS[] = new int[n];
		for (int i = 0; i < n; i++) {
			nextS[i] = n;
		}

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < n; i++) {

			while (!st.isEmpty() && hist[i] < hist[st.peek()]) {

				nextS[st.pop()] = i;
			}

			st.push(i);

		}
		System.out.print("next smaller array" + "\n");

		for (int i : nextS) {
			System.out.print(i + ",");
		}

		return nextS;
	}

	public static int[] prevSmaller(int hist[]) {

		int n = hist.length;
		int prevS[] = new int[n];
		for (int i = 0; i < n; i++) {
			prevS[i] = -1;
		}

		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {

			while (!st.isEmpty() && hist[i] < hist[st.peek()]) {
				st.pop();
			}

			if (!st.isEmpty()) {
				prevS[i] = st.peek();
			}

			st.push(i);
		}

		System.out.print("prev smaller array" + "\n");

		for (int i : prevS) {
			System.out.print(i + ",");
		}

		return prevS;
	}

	private static int getMaxArea(int[] hist) {

		int[] prevS = prevSmaller(hist);
		int[] nextS = nextSmaller(hist);
		int maxArea = 0;

		for (int i = 0; i < hist.length; i++) {
			int width = nextS[i] - prevS[i] - 1;
			int area = hist[i] * width;
			maxArea = Math.max(maxArea, area);
		}

		System.out.println("\nmax area " + maxArea);

		return maxArea;

	}

}
