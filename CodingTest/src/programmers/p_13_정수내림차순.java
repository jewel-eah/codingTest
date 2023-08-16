package programmers;

import java.util.Arrays;
import java.util.Collections;

public class p_13_정수내림차순 {

//	함수 solution은 정수 n을 매개변수로 입력받습니다.
//   n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

	class IntDesc {
	    public long intDesc(long n) {
	        long answer = 0;
	        
	        String arr = Long.toString(n);
	        String[] str = new String[arr.length()];
	        str = arr.split("");
	        Arrays.sort(str, Collections.reverseOrder());
	        
	        String tmp = "";
	        
	        for(String s : str) {
	        	tmp += s;
	        }
	        
	        answer = Long.parseLong(tmp);
	        
	        return answer;
	    }
	}
	

}
