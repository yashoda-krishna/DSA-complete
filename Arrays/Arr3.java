package Smart;

/*
Chocolate Distribution Problem

Each student gets exactly one packet.
The difference between the maximum and minimum number of chocolates in the packets given to the students is minimized.
Examples:

Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 3 
Output: 2 
Explanation: If we distribute chocolate packets {3, 2, 4}, we will get the minimum difference, that is 2. 


Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 5 
Output: 7
Explanation: If we distribute chocolate packets {3, 2, 4, 9, 7}, we will get the minimum difference, that is 9 – 2 = 7. 




*/
import java.util.*;

public class Arr3 {
	public static void main(String[] args) {
		int arr[] = {7, 3, 2, 4, 9, 12, 56};int m = 5 ;
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<m;i++) {
			
			
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println(max-min);
	}
}
