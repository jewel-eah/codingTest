package backjoon;

import java.util.Scanner;

public class al_11_25304_영수증 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int total = scan.nextInt();
		
		int category = scan.nextInt();
		int sum = 0;
		
		for(int i=0; i<category; i++) {
			int price = scan.nextInt();
			int count = scan.nextInt();
			sum += price * count;
		}
		
		if(total == sum) {
			System.out.println("Yes");
		}
		else if(total != sum) {
			System.out.println("No");
		}
		
	}
}
