package Smart;

/*

Print all combinations | Set-2
Last Updated : 28 Mar, 2024
Given an array of size n, generate and print all possible combinations of r elements in the array.

Example:

Input: arr=[1,2,3,4], r=2



Output: 1 2
               1 3
               1 4
               2 3
               2 4
               3 4



Input: arr=[1,2,3,4], r=3



Output:        1 2 3
               1 2 4
               1 3 4
               2 3 4



*/

public class Arr13 {
    static void combinationUtil(int arr[], int data[], int start,int end, int index, int r) {
    	if (index == r) {
    		for (int j=0; j<r; j++)
    			System.out.print(data[j]+" ");
    		System.out.println("");
    		return;
    	}
    	for (int i=start; i<=end && end-i+1 >= r-index; i++){
    			data[index] = arr[i];
    			combinationUtil(arr, data, i+1, end, index+1, r);
    			}
    	}
    static void printCombination(int arr[], int n, int r){
    	int data[]=new int[r];
    	combinationUtil(arr, data, 0, n-1, 0, r);
    	}

    public static void main (String[] args) {
    		int arr[] = {1, 2, 3, 4, 5};
    		int r = 3;
    		int n = arr.length;
    		printCombination(arr, n, r);
    		}
}
