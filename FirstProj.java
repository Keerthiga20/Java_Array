package Practice_java;
import java.util.Arrays;
import java.util.Collections;

public class FirstProj {

	public static int getmaxlenght(int[][] arr) {
		int maxlen = 0, lenarr =0;
		for(int[] i : arr) {
			for(int j : i) {
				lenarr = String.valueOf(j).length();
				if(lenarr>maxlen) {
					maxlen= lenarr;
				}
			}
		}
		return maxlen;
	}

	public static void main(String[] args) {
		//
		int[][] arr = {{78,23,2344},{-78,1234,1111},{34,3,23}};
		int count =0;
		count = getmaxlenght(arr);
		for(int[] i : arr) {
			for(int j : i) {
				System.out.printf("%"+(count+1)+"d",j);
			}
			System.out.println();
		}
		//
	}
	
}
