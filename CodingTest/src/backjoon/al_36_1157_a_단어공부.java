package backjoon;

import java.util.Scanner;

public class al_36_1157_a_단어공부 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		
		System.out.print("입력: ");
		str = scan.next();
		
		String strTmp = str.toUpperCase();
		int max = 0;
		String answer = "";
		int tmpNum = 0;
		for(int i=0; i<strTmp.length(); i++) {
			int count = 0;
			for(int j=i; j<strTmp.length(); j++) {
				if(strTmp.charAt(i) == strTmp.charAt(j)) {
					count ++;
				}
			}
			if(max < count) {
				max = count;
				tmpNum = i;
				answer = String.valueOf(strTmp.charAt(tmpNum));
			}
			else if (max == count) {
				answer = "?";
			}
		}
		System.out.println("답: " + answer);
	}

}
