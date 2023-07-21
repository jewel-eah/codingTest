package backjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class al_39_2577_숫자의개수 {

		public static void main(String[] args) {
//			세 개의 자연수 A, B, C
//			주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지
//
//			예를 들어 A = 150, B = 266, C = 427 이라면
//			A × B × C = 150 × 266 × 427 = 17037300 이 되고
//			계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
			
//			100보다 크거나 같고, 1,000보다 작은 자연수
			
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			int mul = a*b*c;
			
			String tmpMul = String.valueOf(mul);
			String[] muls = new String[tmpMul.length()];
			muls = tmpMul.split("");
			
			int[] num = new int[10];
			for(int i=0; i<10; i++) {
				int count = 0;
				for(int j=0; j<muls.length; j++) {
					if(i == Integer.parseInt(muls[j])) {
						count ++;
					}
					num[i] = count;
				}
			}

			for(int i=0; i<num.length; i++) {
				System.out.println(num[i]);
			}
		}
}
