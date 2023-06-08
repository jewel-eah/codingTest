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
		
		
		for(int i=0; i<roop; i++) {
			int start = scan.nextInt()-1;
			int end = scan.nextInt()-1;
			
			if(end-start <= 1) {
				end +=1;
			}
			Arrays.sort(basket, start, end, Collections.reverseOrder());
			
			for(int k=0; k<basket.length; k++) {
				System.out.print(basket[k] + " ");
			}
		}
		
	}

}
