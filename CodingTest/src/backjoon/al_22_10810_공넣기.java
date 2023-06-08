package backjoon;

import java.util.Scanner;

public class al_22_10810_공넣기 {

	public static void main(String[] args) {

		// 바구니 n 개 있음 1 , 2, 3, .. n 번호붙음
		// 1바구니에는 공이 0개 + 바구니에는 공 1개만 넣을 수 있음
		// 공 n 개 있음 1, 2, 3, .. n 번호붙음
		// 앞으로 M번 공을 넣을 거임
		// 한번 공 넣을때 바구니 범위 정하고 바구니에 같은 번호가 적힌 공 넣음
		// 이미바구니에공있어 ? 빼고새거넣을거
		// 공을 넣을 바구니는 연속되어 있어야함

		Scanner scan = new Scanner(System.in);
		// 바구니 갯수 n
		int n = scan.nextInt();

		// 공 갯수 . 공 넣을 횟수
		int m = scan.nextInt();
		int basket[] = new int[n];

		while (m > 0) {
			int i = scan.nextInt();
			// 바구니 끝
			int j = scan.nextInt();
			// 공 번호
			int k = scan.nextInt();
			for (int x = i - 1; x <= j - 1; x++) {
				basket[x] = k;
			}
			m--;
		}

		// 출력
		for (int l = 0; l < basket.length; l++) {
			System.out.print(basket[l] + " ");
		}
		System.out.println();

	}

}
