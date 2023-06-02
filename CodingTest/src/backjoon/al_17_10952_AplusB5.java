package backjoon;

import java.util.Scanner;

public class al_17_10952_AplusB5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 숫자가 아닌 문자열이 들어왔을때 런종료 
		while (scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum = a + b;
		
			System.out.println(sum);
		}
	}
	
}
