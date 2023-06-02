package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class al_18_10807_개수세기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] arr = new int[count];
		
		for(int i=0; i<count ; i++) {
			arr[i] = scan.nextInt();
		}
		
		int find = scan.nextInt();
		
		int answer = 0;
		for(int i=0; i<arr.length; i++) {
			if(find == arr[i]) {
				answer ++;
			}
		}
		System.out.println(answer);
	}
	
}
