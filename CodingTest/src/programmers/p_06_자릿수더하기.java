package programmers;

public class p_06_자릿수더하기 {

	// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

	public static class CountDigits {
		public int countDigits(int n) {
			int answer = 0;
			String num = Integer.toString(n);

			String[] arr = new String[num.length()];
			arr = num.split("");

			for (int i = 0; i < arr.length; i++) {
				answer += Integer.parseInt(arr[i]);
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		CountDigits countdigits = new CountDigits();
		int ex = 123;
		System.out.println("answer: " + countdigits.countDigits(ex));
	}

}
