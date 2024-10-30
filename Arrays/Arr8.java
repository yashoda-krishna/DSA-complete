package Smart;

/*
1423. Maximum Points You Can Obtain from Cards


Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. 
However, choosing the rightmost card first will maximize your total score. 
The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
Example 2:

Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.
Example 3:

Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.



*/
public class Arr8 {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,1};int k=3;
		System.out.println(maxScore(arr, k));
	}
	 static int maxScore(int[] cardPoints, int k) {
         int n = cardPoints.length;
        int leftSum = 0;
        for (int i = 0; i < k;i++) { 
            leftSum += cardPoints[i];
        }
        int rightSum = 0;
        int rightIndex = n;
        int ans = leftSum;
        for (int leftIndex = k - 1; leftIndex >= 0;leftIndex--) {
            leftSum -= cardPoints[leftIndex];
            rightIndex--;
            rightSum += cardPoints[rightIndex];
            ans = Math.max(ans, leftSum + rightSum);
        }
        return ans;
    }
}
