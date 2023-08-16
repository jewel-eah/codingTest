package programmers;

public class p_05_평균구하기 {
	
	// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	
	public static class Average {
	    public double average(int[] arr) {
	        double answer = 0;
	        
	        for(int i=0; i<arr.length; i++) {
	        	answer += arr[i];
	        }
	        return answer /= arr.length;
	    }
	}
	
	public static void main(String[] args) {
		Average average = new Average();
		int ex[] = {1, 2, 3, 4};
		System.out.println("average : " + average.average(ex));
		
	}
	
}
