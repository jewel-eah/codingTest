package backjoon;

import java.util.Scanner;

public class al_37_1157_b_단어공부 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("입력: ");
		String str = scan.next().toUpperCase();
	
		int[] cha = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			int tmpNum = str.charAt(i) - 65;
			System.out.println("count: "+ tmpNum);
			cha[tmpNum] ++;
		}
		
		// 원소값 
		int max = -1;
		char answer = '?';
		
		for (int i=0; i<cha.length; i++) {
			System.out.println("cha[i] :"+ cha[i]);  
			if(cha[i] > max) {
				max = cha[i];
				System.out.println("max :"+ max);  
				answer = (char) (i+65);
			}
			else if (cha[i] == max) {
				answer = '?';
			}
		}
		System.out.println("answer: " +answer);
		
	}
}
