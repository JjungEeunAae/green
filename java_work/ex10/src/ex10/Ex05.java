package ex10;

class AA {
	int a = 10;
	// static : 공유변수, 프로그램 시작과 동시에 초기화해서 프로그램 끝낼 때 까지 공유되는 변수
	static int b = 20;
};

public class Ex05 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();
		
		a1.a++;
		System.out.println(a1.a);
		System.out.println(a2.a);
		
		// 공유변수를 사용한 필드, 선언하는 그 순간 메모리에 선언된다.
		AA.b++;	// 자바 권장 방식
		a1.b++;	// 자바 비권장 방식
		
		// 자바 권장 방식
		System.out.println(AA.b);
		
		// 자바 비권장 방식
		System.out.println(a1.b);
		System.out.println(a2.b);
		
		// 공유변수가 아니기 때문에 오류가 발생한다. 꼭 인스턴스화 해준 다음 사용해줘야 한다.
		// System.out.println(AA.a); error!!
	}
}
