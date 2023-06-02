package backjoon;

import java.util.Scanner;

public class al_08_2739_구구단 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int answer = 0;
		
		for(int i=1; i<10; i++) {
			answer = n * i;
			System.out.println(n + " * " + i + " = " + answer);
		}

	}

}
