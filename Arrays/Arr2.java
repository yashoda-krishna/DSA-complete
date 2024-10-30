package Smart;

/*

121. Best Time to Buy and Sell Stock


 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.



*/

public class Arr2 {
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int min = Integer.MAX_VALUE,max=0,todayprofit=0,todayprice=0;
		for(int price : arr) {
			todayprice=price;
			if(todayprice < min) {
				min=todayprice;
			}
			todayprofit=todayprice-min;
			if(todayprofit > max) {
				max=todayprofit;
			}
		}
		System.out.println(max);
	}
}
