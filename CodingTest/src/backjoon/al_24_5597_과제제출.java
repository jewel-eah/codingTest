package backjoon;

import java.util.Scanner;

public class al_24_5597_과제제출 {

	public static void main(String[] args) {

		// student = 30; 1~ 30;
		// submit = 28;
		
		Scanner scan = new Scanner(System.in);
		
		int student[] = new int[30];
		
		int count = 28;
		while(count > 0) {
			int submit = scan.nextInt();
			if(submit > 0 && submit < 31) {
				student[submit-1] = submit;
			}
			count --;
		}
		
		for(int i=0; i<student.length; i++) {
			if(student[i] == 0) {
				System.out.println(i+1);
			}
		}
	}

}
