package ex01;

public class Programmers {
	public static void main(String[] args) {
		System.out.println(solution(">", "!", 41, 78));
    }
	
	public static int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		
		if(ineq.equals("<") && eq.equals("=")) {
			if(n <= m) {
				answer = 1;
			} else {
				answer = 0;
			}
		} else if(ineq.equals(">") && eq.equals("=")) {
			if(n >= m) {
				answer = 1;
			} else {
				answer = 0;
			}
		} else if(ineq.equals(">") && eq.equals("!")) {
			if(n > m) {
				answer = 1;
			} else {
				answer = 0;
			}
		} else if(ineq.equals("<") && eq.equals("!")) {
			if(n < m) {
				answer = 1;
			} else {
				answer = 0;
			}
		};
        return answer;
    }
}


