package Smart;
/*

1499. Max Value of Equation
Solved
Hard
Topics
Companies
Hint
You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values, where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length. You are also given an integer k.

Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.

It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.

 

Example 1:

Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
Output: 4
Explanation: The first two points satisfy the condition |xi - xj| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.
No other pairs satisfy the condition, so we return the max of 4 and 1.
Example 2:

Input: points = [[0,0],[3,0],[9,2]], k = 3
Output: 3
Explanation: Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.
 

Constraints:

2 <= points.length <= 105
points[i].length == 2
-108 <= xi, yi <= 108
0 <= k <= 2 * 108
xi < xj for all 1 <= i < j <= points.length
xi form a strictly increasing sequence.

*/
public class Arr20 {
	public static void main(String[] args) {
		
	}
	    public int findMaxValueOfEquation(int[][] points, int k) {
	        
	    int ans = Integer.MIN_VALUE;
	    // Initialize the answer to the smallest possible integer value.

	    int i = 0;
	    // Start with the first point in the array.

	    int f = 1;
	    // Initialize a variable f to be 1, which will be used to track the next point to consider for the equation.

	    while(i < points.length) {
	        // Loop through each point in the array using the variable i.

	        if(f < i + 1)
	            f = i + 1;
	        // Ensure f is always ahead of i by at least 1. This ensures j > i.

	        for (int j = f; j <= points.length - 1; j++) {
	            // Loop through the points starting from f to the end of the array.

	            if(points[j][0] > (points[i][0] + k))
	                break;
	            // If the x-coordinate of point j is greater than the x-coordinate of point i plus k, break the loop.
	            // This means |xi - xj| > k, and we can't use this pair.

	            if((points[i][1] + points[j][1] + points[j][0] - points[i][0]) > ans) {
	                ans = points[i][1] + points[j][1] + points[j][0] - points[i][0];
	                // Calculate the value of the equation yi + yj + |xi - xj| (since xi <= xj, |xi - xj| = xj - xi).
	                // If this value is greater than the current answer, update the answer.

	                f = j - 1;
	                // Update f to j - 1. This is to optimize the inner loop by reducing the number of comparisons.
	            }
	        }
	        i++;
	        // Move to the next point in the array.
	    }

	    return ans;
	    }
	/*

	int ans = Integer.MIN_VALUE;
	    Deque<Pair<Integer, Integer>> maxQ = new ArrayDeque<>(); // (y - x, x)

	    for (int[] point : points) {
	      final int x = point[0];
	      final int y = point[1];
	      // Remove the invalid points, xj - xi > k
	      while (!maxQ.isEmpty() && x - maxQ.peekFirst().getValue() > k)
	        maxQ.pollFirst();
	      if (!maxQ.isEmpty())
	        ans = Math.max(ans, x + y + maxQ.peekFirst().getKey());
	      // Remove the points that contribute less value and have a bigger x.
	      while (!maxQ.isEmpty() && y - x >= maxQ.peekLast().getKey())
	        maxQ.pollLast();
	      maxQ.offerLast(new Pair<>(y - x, x));
	    }

	    return ans;

	*/
}
