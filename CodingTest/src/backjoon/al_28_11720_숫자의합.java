package backjoon;

import java.util.Scanner;

public class al_28_11720_숫자의합 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = scan.nextInt();	
		
		int sum = 0;
		
		String ex = scan.next();
		String[] arr = new String[n];
		arr = ex.split("");
		
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
}
