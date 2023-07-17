package backjoon;

import java.util.Scanner;

public class al_34_27866_문자와문자열 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = "";
		int i = 0;
		
		System.out.print("입력 : ");
		s = scan.next();
		System.out.print("순서 : ");
		i = scan.nextInt();
		
		System.out.println(s.charAt(i-1));
		
	}
}
