package backjoon;

import java.util.Scanner;

public class al_14_11022_AplusB8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		for(int i=1; i<count+1; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum = a+b;
			System.out.println("Case #"+i+": "+a +" + "+b+" = "+sum);
		}
		
	}
}
