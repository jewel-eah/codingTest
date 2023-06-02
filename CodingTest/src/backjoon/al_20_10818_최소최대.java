package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class al_20_10818_최소최대 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}

		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);
		
//		int max = 0;
//		int min = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//			else  {
//				min = arr[i];
//			}
//		}
//		System.out.println(min + " " + max);
	}

}
