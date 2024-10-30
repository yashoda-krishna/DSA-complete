package Smart;

/*


11. Container With Most Water


 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1




*/
public class Arr7 {
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		int l=0,r=arr.length-1,sum=0,ans=0;
		
		while(l<r) {
			int minhe=Math.min(arr[l], arr[r]);
			ans = Math.max(ans, minhe*(r-l));
			if(arr[l]<arr[r]) {
				l++;
			}else {
				r--;
			}
		}
		System.out.println(ans);
	}
}
