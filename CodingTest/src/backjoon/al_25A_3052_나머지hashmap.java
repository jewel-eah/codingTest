package backjoon;

import java.util.HashSet;
import java.util.Scanner;

public class al_25A_3052_나머지hashmap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		int n = 10;
		for(int i=0; i<n; i++) {
			// 존재하지 않는 값이라면 저장하는 메소드 
			hs.add(scan.nextInt()%42);
		}
		// 완성된 해쉬셋의 길이(size)
		System.out.println(hs.size());
	}

}
