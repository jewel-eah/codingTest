package backjoon;

import java.util.Scanner;

public class al_21_2562_최댓값 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = 0;
		int count = 0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
				count = j;
			}
		}
		System.out.println(max);
		System.out.println(count+1);
		
	}

}
