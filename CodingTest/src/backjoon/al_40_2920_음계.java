package backjoon;

import java.util.Scanner;

public class al_40_2920_음계 {
	public static void main(String[] args) {
		
//		다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다
//		c는 1로, d는 2로, ..., C를 8로 바꾼다.

//		1부터 8까지 차례대로 연주한다면 ascending // 1 2 3 4 5 6 7 8 9
//		8부터 1까지 차례대로 연주한다면 descending // 8 7 6 5 4 3 2 1
//		둘 다 아니라면 mixed
		
		Scanner scan = new Scanner(System.in);
		
		String[] inputs = scan.nextLine().split(" ");
		int[] nums = new int[inputs.length];
		for(int i=0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(inputs[i]);
		}
		
		String answer = "";
		for(int i=0; i<nums.length-1; i++) {
			if((nums[i]+1) == nums[i+1]) {
				answer = "ascending";
			}
			else if((nums[i]-1) == nums[i+1]) {
				answer = "descending";
			}
			else {
				answer = "mixed";
				break;
			}
		}
		System.out.println(answer);
	}
}
