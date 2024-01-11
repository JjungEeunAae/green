package ex09;

public class Ex01 {
	// 프로그래머스 주사위 게임 2
	public static int solution(int a, int b, int c) {
		int answer = 0;
		
		// 모두 같으면?
		if(a == b && a == c) {
			System.out.println("3개의 숫자가 모두 동일함");
			answer = (a+b+c) * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c);
		} else if (a != c && b != c) {
			System.out.println("3개의 숫자가 모두 다름");
			answer = a+b+c;
		} else {
			System.out.println("3개의 숫자 중 2개만 동일함");
			answer = (a+b+c) * (a*a+b*b+c*c);
		};
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(4,4,4));
	}
}
