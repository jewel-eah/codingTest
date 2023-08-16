package programmers;

public class p_07_약수의합 {

	// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
	
	public static class SumOfDivisor {
	    public int smOfDivisor(int n) {
	        int answer = 0;
	        
	        // i<= n/2 절반만 돌리고 answer + n 을 해도 결과값이 똑같이 나옴 
	       for(int i=1; i<=n; i++) {
	    	   if(n % i == 0) {
	    		   answer += i;
	    	   }
	       }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		
		SumOfDivisor sumOfDivisor = new SumOfDivisor();
		System.out.println("answer : " + sumOfDivisor.smOfDivisor(12));
		
		
	}
	
	
}
