package backjoon;

import java.util.Scanner;

public class al_42_8958_ox퀴즈 {
	public static void main(String[] args) {

		// " OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다
		// 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수
		// 예를 들어, 10번 문제의 점수는 3이 된다.
		// "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

		Scanner scan = new Scanner(System.in);

		int test = scan.nextInt();

		for (int j = 0; j < test; j++) {
			int sum = 0;
			int count = 0;
			String[] result = scan.next().split("");
			for (int i = 0; i < result.length; i++) {
				if (result[i].equals("O")) {
					count++;
				}
				if (result[i].equals("X")) {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}
