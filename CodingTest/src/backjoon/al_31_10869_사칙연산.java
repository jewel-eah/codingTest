package backjoon;

import java.util.Scanner;

public class al_31_10869_사칙연산 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while(run) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a >= 1 && b <= 10000) {
				int sum = a+b;
				int minus = a-b;
				int mul = a*b;
				int div = a/b;
				int rem = a%b;
				System.out.println(sum);
				System.out.println(minus);
				System.out.println(mul);
				System.out.println(div);
				System.out.println(rem);
				break;
			}
		}
		
		
		
	}
}
