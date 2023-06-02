package backjoon;

import java.util.Scanner;

public class al_01_1330_두수비교 {

	public static void main(String[] args) {
		int a , b;
		
		Scanner scan = new Scanner(System.in);
	
		a = scan.nextInt();
		b = scan.nextInt();
		

		if(a > b) {
			System.out.println(">");
		}
		else if(a < b) {
			System.out.println("<");
		}
		else if (a == b) {
			System.out.println("==");
		}
			
	}
}
