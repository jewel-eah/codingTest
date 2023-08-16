package programmers;

public class p_09_자연수뒤집어배열만들기 {

	// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
	// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

	class RiverseArray {
		public int[] riverseArray(long n) {
			int[] answer = new int[(int) Math.log10(n)+1];

			String tmpN = Long.toString(n);
			String[] arr = new String[tmpN.length()];
			arr = tmpN.split("");

			int num = 0;
			for (int i = arr.length-1; i >= 0; i--) {
				answer[num] = Integer.parseInt(arr[i]);
				num++;
			}

			return answer;
		}
	}

}
