package interview_asks.companies;

public class StockSellAndBuy {

	public static void main(String[] args) {

		int[] prices = { 100, 180, 260, 310, 40, 535, 695 };

		maxProfit(prices);

	}

	public static void maxProfit(int[] prices) {

		int n = prices.length;
		int res = 0;
		for (int i = 1; i < n; i++) {

			if (prices[i] > prices[i - 1]) {
				res += prices[i] - prices[i - 1];
			}

		}

		System.out.println("max profit is " + res);

	}

}
