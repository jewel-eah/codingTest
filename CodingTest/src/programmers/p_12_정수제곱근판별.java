package programmers;

public class p_12_정수제곱근판별 {
	// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

	// 121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
	// 3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.

	public static class CheckSqrt {
		public long checkSqrt(long n) {
			long answer = -1;

			for (long x = 1; x <= n/2; x++) {
				if (n / x == x && n%x == 0) {
					answer = (x + 1) * (x + 1);
					break;
				}
			}
			return answer;
		}

	}

	public static void main(String[] args) {
		CheckSqrt CheckSqrt = new CheckSqrt();
		System.out.println("CheckSqrt:" + CheckSqrt.checkSqrt(121));

	}

}
