package com.davis.piersqure.array.leetCode.array.string;

//122. Best Time to Buy and Sell Stock II
public class BuySellStockII {

	public static int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {

			if (prices[i] > prices[i - 1]) {
				profit = profit + (prices[i] - prices[i - 1]);
			}
		}
		return profit;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 1, 2, 3, 4, 5 };
		System.out.println(maxProfit(prices));
	}

}
//Input: prices = [7,1,5,3,6,4]
//Output: 7