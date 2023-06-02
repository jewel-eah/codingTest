package backjoon;

import java.util.Scanner;

public class al_06_2525_오븐시계 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		
		int H = scan.nextInt();
	
		int M = scan.nextInt();
	
		int time = scan.nextInt();
		
	
		M += time;
	
		if (M >= 60) {
			H += M / 60 ;
			M = M % 60 ;
		}
		
		if(H >= 24) {
			H -= 24;
		}
		System.out.println(H + " " + M);
	}

}
