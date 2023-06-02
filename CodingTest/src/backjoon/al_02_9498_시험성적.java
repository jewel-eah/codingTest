package backjoon;

import java.util.Scanner;

public class al_02_9498_시험성적 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		if(score >= 0 && score <= 100) {
			if(score > 89 && score <= 100) {
			System.out.println("A");
		}
		else if(score > 79 && score <= 89) {
			System.out.println("B");
		}
		else if(score > 69 && score <= 79) {
			System.out.println("C");
		}
		else if(score > 59 && score <= 69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		}

	}

}
