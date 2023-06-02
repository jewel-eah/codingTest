package backjoon;

import java.util.Scanner;

public class al_05_2884_알람시계 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시간 : ");
		int h = scan.nextInt();
		System.out.println("분 : ");
		int m = scan.nextInt();
		int setM = 0;
		
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			setM = m - 45;
			if(setM < 0 ) {
				m = setM;
				setM = 60 + m;
				h --;
				if(h < 0) {
					h = 23;
					System.out.println(h + " " + setM);
				}
			
			}
			else {
				setM = 60 - m;
				System.out.println(h + " " + setM);
				
			}
		}
		
	}

}
