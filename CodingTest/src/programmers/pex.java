package programmers;

public class pex {

	public static void main(String[] args) {
		// n 121 > return 144;
		
		long answer = -1;
		long n = 121;
		for (int x = 1; x < n/2; x++) {
			if (n / (long) x == x) {
				System.out.println("x" + x );
				answer = (long) ((x + 1) * (x + 1));
				System.out.println("ex:" + answer);
				break;
			}
		}

		System.out.println("asnwer:" + answer);
	}
}
