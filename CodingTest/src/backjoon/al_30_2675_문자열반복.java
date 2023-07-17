package backjoon;

import java.util.Scanner;

public class al_30_2675_문자열반복 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = "";
		int r = 0;
		String p = "";

		boolean isAlphanumeric = s.chars().allMatch(Character::isLetterOrDigit);

		System.out.println("t: ");
		int t = scan.nextInt();

		if (t >= 1 && t <= 1000) {
			while (t > 0) {
				System.out.print("r : ");
				r = scan.nextInt();
				if (r >= 1 && r <= 8) {
					System.out.print("s :");
					s = scan.next();
					if (s.length() >= 1 && s.length() <= 20 && isAlphanumeric) {
						String[] arr = s.split("");
						System.out.println(arr.length);
						for (int i = 0; i < arr.length; i++) {
							for (int k = 0; k < r; k++) {
								p += arr[i];
							}
						}
						p += ("\n");
					}
				}
				t--;
			}
		}
		System.out.println(p);
	}
}
