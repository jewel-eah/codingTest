package backjoon;

import java.util.Scanner;

public class al_12_25314_long {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int count = num / 4;
		for(int i=0; i<count; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		
	}
}
