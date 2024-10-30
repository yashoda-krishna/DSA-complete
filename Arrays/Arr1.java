package Smart;

import java.util.Arrays;

public class Arr1 {
	public static void main(String[] args) {
		int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int m = arr.length;
		int n = arr[0].length;
		boolean shouldFillFirstRow = false;
		boolean shouldFillFirstCol = false;
		
		 for(int i=0;i<m;i++) {
			 if(arr[0][i]==0) {
				 shouldFillFirstRow=true;
				 break;
			 }
		 }
		 for(int i=0;i<n;i++) {
			 if(arr[i][0]==0) {
				 shouldFillFirstCol=true;
				 break;
			 }
		 }
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(arr[i][j]==0) {
					arr[i][0]=0;
					arr[0][j]=0;
				}
			}
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(arr[i][0]==0 || arr[0][j]==0) {
					arr[i][j]=0;
				}
			}
		}
		
		if(shouldFillFirstRow) {
			for(int i=0;i<n;i++) {
				arr[0][i]=0;
			}
		}
		if(shouldFillFirstCol) {
			for(int i=0;i<m;i++) {
				arr[i][0]=0;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
