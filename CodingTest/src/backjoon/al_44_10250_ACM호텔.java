package backjoon;

import java.util.Scanner;

public class al_44_10250_ACM호텔 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		// h : 호텔의 층 . w: 층의 방수 . n : 몇번째 손님

		for (int i = 0; i < T; i++) {
			
			String[] input = scan.next().split(" ");
			for(int j=0; i<input.length; j++) {
				System.out.println("size "+input.length);
				System.out.println("input "+input[j]);
			}
//			for(int j=0; j<input.length; j++) {
//				int h = Integer.parseInt(input[0]);
//				int w = Integer.parseInt(input[1]);
//				int n = Integer.parseInt(input[2]);
//				
//				int y, x;
//				
//				if (n / h == 0) {
//					y = h * 100;
//					x = (n / h);
//				}
//				
//				else {
//					y = (n % h) * 100;
//					x = (n / h) + 1;
//				}
//				
//				int yyxx = y + x;
//				System.out.println(yyxx);
//			}
//					
//			int h = st.
//			System.out.println("h :"+h);
//			int w =  st.hashCode();
//			System.out.println("w :"+w);
//			int n =  st.hashCode();
//			System.out.println("n :"+n);
		}

	}
}
