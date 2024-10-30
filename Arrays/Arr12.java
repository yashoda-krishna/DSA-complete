package Smart;

/*
493. Reverse Pairs

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
 

Constraints:

1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1




*/
public class Arr12 {
	int count = 0;
	public static void main(String[] args) {
	}
		/*

		int count = 0;
		        for (int i = 0; i < arr.length; i++)
		            for (int j = i+1; j < arr.length; j++)
		                if ((long)arr[i] > (long)2 * arr[j])    // 21,47,483,647, which is max value of int, was given in some test cases
		                    count++;
		        return count;


		*/
		    void merge(int[] arr, int l, int mid, int r) {
		        // First subarray is arr[l..m]
		        // Second subarray is arr[m+1..r]
		        int n1 = (int)(mid - l + 1);
		        int n2 = (int)(r - mid);    // r - (mid + 1) + 1
		        
		        // create temp arrays
		        int[] L = new int[n1];
		        int[] R = new int[n2];
		        
		        // copy data to temp arrays
		        for (int i = 0; i < n1; i++)
		            L[i] = arr[l+i];
		        for (int j = 0; j < n2; j++)
		            R[j] = arr[mid+1+j];
		            
		        /* Code to count reverse pairs */
		        int j = 0;
		        for (int i = 0; i < n1; i++) {
		            while (j < n2 && L[i] > (2 * (long)R[j]))
		                j++;
		            count += j;
		        }
		        
		        // Merge temp arrays
		        int i = 0, k = (int)l; j = 0;
		        
		        while (i < n1 && j < n2) {
		            if (L[i] <= R[j])
		                arr[k++] = L[i++];

		            else
		                arr[k++] = R[j++];
		        }
		        
		        while (i < n1)
		            arr[k++] = L[i++];

		        while (j < n2)
		            arr[k++] = R[j++];

		    }
		    void mergeSort(int[] arr, int l, int r) {
		        if (l < r) {
		            int mid = l + (r-l)/2;
		            
		            mergeSort(arr, l, mid);
		            mergeSort(arr, mid+1, r);
		            
		            merge(arr, l, mid, r);
		        }
		    }
		    public int reversePairs(int[] arr) {
		        mergeSort(arr, 0, arr.length-1);
		        return count;
		    }
	}
