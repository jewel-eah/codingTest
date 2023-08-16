package programmers;

public class p_10_문자열내p와y의개수 {

	// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
	// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
	// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
	// 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.


	class CountPnY {
	    boolean countPnY(String s) {
	        boolean answer = true;

	        String str = s.toUpperCase();
	        int count = 0;
	        
	        for(int i=0; i<str.length(); i++) {
	        	if(str.charAt(i) == (char)'P') {
	        		count ++;
	        	}
	        	else if(str.charAt(i) == (char)'Y') {
	        		count --;
	        	}
	        }
	        
	        if(count != 0) {
	        	answer = false;
	        }
	        
	        return answer;
	    }
	}

	// 정규식 이용한 풀이 참고해보기 ..
	// return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;

}
