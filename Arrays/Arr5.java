package Smart;
/*
 * 974. Subarray Sums Divisible by K
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);
        int answer = 0;
        int sum = 0;
        for (int num : nums) {
            sum = ((sum + num) % k + k) % k;
            answer += countMap.getOrDefault(sum, 0);
            countMap.merge(sum, 1, Integer::sum);
        }
        return answer;
    }
}

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0
 


*/
public class Arr5 {
	public static void main(String[] args) {
		int[] A = {4,5,0,-2,-3,1};int K=5;
		int res = 0;
	    for(int i = 0; i < A.length; i++){
	        int sum = 0;
	        for(int j = i; j < A.length; j++){
	            sum += A[j];
	            if(sum % K == 0){
	                res++;
	            }
	        }
	    }
	    System.out.println(res);
	}
}
