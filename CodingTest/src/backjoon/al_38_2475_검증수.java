package backjoon;

import java.util.Scanner;

public class al_38_2475_검증수 {
	public static void main(String[] args) {
		
		// 유번호의 처음 5자리에 들어가는 5개의 숫자를
		// 각각 제곱한 수의 합을 10으로 나눈 나머지
		// 0으로 나눈 나머지인 1이 검증수
		
//		첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		String input = scan.nextLine();
		String[] str = input.split(" ");
		
		int[] inputs = new int[6];
		
		for(int i=0; i<str.length; i++) {
			inputs[i] = Integer.parseInt(str[i]);
		}
		

		int num = 0; 
		int answer = 0;
		for(int i=0; i<inputs.length-1; i++) {
			num += inputs[i] * inputs[i];
		}
		answer = num % 10;
		System.out.println(answer);

		
	}
}
