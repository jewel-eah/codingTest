package backjoon;

import java.util.Scanner;

public class al_07_2480_주사위세개 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		
		int money = 0;
		
		if(x == y && y == z) {
			money = 10000 + (x * 1000);
		}
		else if(x == y || y == z || z == x) {
			if(x == y) {
				money = 1000 + (x * 100);
			}
			else if (y == z) {
				money = 1000 + (y * 100);
			}
			else if (x == z) {
				money = 1000 + (z * 100);
			}
		}
		else if(x != y && y != z && z != x) {
			int max = 0;
			if(x > max) {
				max = x;
			}
			if(y > max) {
				max = y;
			}
			if(z > max) {
				max = z;
			}
			
			money = max * 100;
		}
		
		System.out.println(money);
	}

}
