package backjoon;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Collections;
import java.util.Scanner;

public class al_26_10811_바구니뒤집기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//바구니n
		// 바구니를 역순으로 만들려고함 범위를 정해서 
		
		int count = scan.nextInt();
		int roop = scan.nextInt();
		
		Integer basket[] = new Integer[count];
		int num = 1;
		
		for(int b=0; b<basket.length; b++) {
			basket[b] = num;
			num++;
			System.out.println(basket[b]+ " ");
		}
		
		while(roop>0) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			int sum = end-start;
			if(start <= count && end <= count) {
				if(sum > 1) {
					int temp = basket[start];
					for(int i=start; i<end; i++) {
						basket[i] = basket[sum-i];
					}
					basket[end] = temp; 
				}
				else {
					for(int i=start; i<end; i++) {
						int temp = basket[start];
						basket[i] = basket[i+1];
						basket[i+1] = temp;
					}
				}
			}
			roop --;
		}

		for(int b=0; b<basket.length; b++) {
			
			System.out.println(basket[b]+ " ");
		}
	}

}
