package ex03_1;

public class Ex02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 입력받은 값이 a와 b사이인지 확인하는 것을 출력하세요
		// a<15<b
		int input = 15;			//입력받은 값
		// && : 그리고(AND)
		System.out.println(a < input && input < b);
		
		// 30을 5로 나누었을 때 나머지가 0 또는 30을 7로 나누었을 때 나머지가 0인가?
		
		// || : 또는(OR)
		// 둘 중에 하나라도 true라면 결과 값이 true가 나온다.
		System.out.println(30%5 == 0 || 30%7 == 0);
		// && : 그리고(AND)
		if(30%5 == 0 && 30%7 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		boolean bool = true;
		if(bool) {
			System.out.println("bool의 값은 참입니다.");
		}
		
	}
}
