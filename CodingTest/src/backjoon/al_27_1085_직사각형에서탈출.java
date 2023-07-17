package backjoon;

import java.util.Scanner;

public class al_27_1085_직사각형에서탈출 {

	public static void main(String[] args) {
		
		// 한수는 지금 (x, y)에 있다
		// 직사각형은 각 변이 좌표축에 평행하고,
		// 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
		// 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
		
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int xMin = Math.min(x, w-x);
		int yMin = Math.min(y, h-y);
		
		int answer = Math.min(xMin, yMin);
		System.out.println(answer);
		
		
	}
	
}
