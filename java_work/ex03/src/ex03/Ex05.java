package ex03;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(solution(64,6));
		
	}
	
	public static int solution(int n, int k) {
        double answer = Math.floor(n / 10);
        int result = 0;
        // 
        if(answer / 10 == k) {
        	result = n * 12000;
        } else {
        	result = (n * 12000) + ((k - 1) * 2000);
        };
        return result;
    }
}
