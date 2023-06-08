package backjoon;

import java.util.Scanner;

public class al_23_10813_공바꾸기 {

	public static void main(String[] args) {

		// 바구니 n 개 ( 1번부터 ) 
		// 바구니와 같은 숫자의 공이 1개씩 들어있음 
		// m 번 공 변경 
		// 바꿀 바구니 2개 선택 > 서로 교환 
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = 1;
		int basket[] = new int[n];
		
		for(int i=0; i<n; i++) {
			basket[i] = k;
			k ++;
		}

		while(m > 0) {
			int i = scan.nextInt();
			int j = scan.nextInt();
		
			int temp = basket[i-1];
			basket[i-1] = basket[j-1];
			basket[j-1] = temp;
			
			m --;
		}
		for(int l=0; l<basket.length; l++) {
			System.out.print(basket[l]+" ");
		}
	}

}
