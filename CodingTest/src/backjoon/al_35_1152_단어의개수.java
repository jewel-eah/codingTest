package backjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class al_35_1152_단어의개수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String sen = scan.nextLine();
		int count = 0;

//		if (sen.length() <= 1000000) {
//			for (int i = 0; i < sen.length(); i++) {
//				if (sen.charAt(i) == ' ') {
//					count++;
//				}
//
//			}
//			if (sen.charAt(0) == ' ' && sen.charAt(sen.length() - 1) == ' ') {
//				count--;
//			}
//			if (sen.charAt(0) != ' ' && sen.charAt(sen.length() - 1) != ' ') {
//				count++;
//			}
//
//			System.out.println(count);
//
//		}
		
		StringTokenizer st = new StringTokenizer(sen, " ");
		System.out.println(st.countTokens());

	}
}
