package Smart;
// spiral matrix
import java.util.ArrayList;
import java.util.List;

public class Arr9 {
	public static void main(String[] args) {
		int[][] m= {{1,2,3,4},
				   {5,6,7,8},
				   {9,10,11,12},
				   {13,14,15,16}};
		int top=0,bot=m.length-1,right=m[0].length-1,left=0;
		List<Integer> list = new ArrayList<Integer>();
		while(top<=bot && left<=right) {
			for(int i=left;i<=right;++i) {
				list.add(m[top][i]);
			}
			top++;
			for(int j=top;j<=bot;++j) {
				list.add(m[j][right]);                    //[1, 2, 3, 4, 8, 12, 16, 3, 2, 1, 11, 10, 6, 7, 11, 6]
			}
			right--;
			if(top <= bot) {
				for(int i=right;i>=left;--i) {
					list.add(m[bot][i]);
				}
				bot--;
			}
			if( left <= right) {
				for(int i=bot;i>=top;--i) {
					list.add(m[i][left]);
				}
				left++;
			}
		}
			System.out.println(list);
	}
}
