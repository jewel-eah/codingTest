package backjoon;

import java.util.Scanner;

public class al_16_2439_별찍기02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		for(int i=1; i<=count; i++) {
			for(int j=1; j<=count-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
