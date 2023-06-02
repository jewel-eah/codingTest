package backjoon;

import java.util.Scanner;

public class al_15_2438_별찍기01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		for(int i=0; i<count; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
