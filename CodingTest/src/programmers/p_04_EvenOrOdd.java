package programmers;

public class p_04_EvenOrOdd {
	
	// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
	
	public static class EvenOrOdd {
		   public String evenOrOdd(int num) {
		        String answer = "Odd";
		        
		        if(num % 2 == 0) {
		        	answer = "Even";
		        }
		        
		        return answer;
		   }
		
//		삼항연상자 활용 
//		String evenOrOdd(int num) {
//			return (num % 2 == 0) ? "Even" : "Odd";
//		}
	}
	
	public static void main(String[] args) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		System.out.println("answer: " + evenOrOdd.evenOrOdd(3));
	}
}
