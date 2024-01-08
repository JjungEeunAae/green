package ex06;

public class Ex01 {
	public static int solution(int a, int b) {
		/*
		 * String -> double : Double.parsDouble(변수명);
		 * String -> int    : Integer.parseInt(변수명);
		 * String -> flaot  : Integer.parseFloat(변수명);
		 */
		int answer = 0;
		if(Integer.parseInt(a+""+b) > Integer.parseInt(b+""+a)) {
			answer = Integer.parseInt(a+""+b);
			
			if(answer == Integer.parseInt(b+""+a)) {
				answer = Integer.parseInt(b+""+a);
			}
		} else {
			answer = Integer.parseInt(b+""+a);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(8,89)); 
	}
}
