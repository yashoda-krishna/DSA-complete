package Smart;
/*

55. Jump Game
Medium


 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what.
 Its maximum jump length is 0, which makes it impossible to reach the last index.


*/

public class Arr11 {
	public static void main(String[] args) {
		
	}
	 public boolean canJump(int[] nums) {
	        int n=nums.length,i=n-2;
	        int goal=n-1;
	        while(i>=0){
	            if(i+nums[i]>=goal){
	                goal=i;
	                i--;
	            }else{i--;}
	        }
	        return goal==0?true:false;
	    }
}
