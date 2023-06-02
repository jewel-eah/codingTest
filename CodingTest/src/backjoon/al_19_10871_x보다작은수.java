package backjoon;

import java.util.Scanner;

public class al_19_10871_x보다작은수 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		int arr[] = new int[n];
		
		
		for(int i=0; i<n; i++) {
			int num = scan.nextInt();
			if(num > 0 && num <= 10000 ) {
				arr[i] = num;
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] < x) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}
