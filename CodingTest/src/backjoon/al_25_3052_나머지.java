package backjoon;

import java.util.Scanner;

public class al_25_3052_나머지 {

	public static void main(String[] args) {
		
		// int a , b ;
		// 10개 수 입력 
		// 42로 나눈 나머지 
		// 다른 값은 몇개 ? 
		Scanner scan = new Scanner(System.in);
		
		int n = 10;
		int remainder[] = new int[n];
		int count = 0;
		for(int k=0; k<n; k++) {
			int a = scan.nextInt();
			remainder[k] = a%42;
		}
		
		// 완성된 나머지배열 
		for(int r=0; r<remainder.length; r++) {
			System.out.print(remainder[r]+ " ");
		}
		
		for(int i=0; i<remainder.length; i++) {
			int same = 0;
			for(int j=i+1; j<remainder.length; j++) {
				// 중복값 있으면 ++
				if(remainder[i] == remainder[j]) {
					same ++;
				}
			}
			// 중복없는것들만 ++
			if(same == 0) {
				count++;
			}
		}
		
		System.out.println("count:" + count);

	}

}
