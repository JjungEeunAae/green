package chap02;

// 하나의 클래스
class VarEx1 {
	// 하나의 메서드(함수)
	public static void main(String[] args) {
		int year = 0;	// 하나의 변수
		int age  = 14;	// 하나의 변수
		 
		System.out.println(year);	// 변수에 담긴 값을 출력
		System.out.println(age);	// 변수에 담긴 값을 출력

		year = age + 2000;
		age  = age + 1;

		System.out.println(year);
		System.out.println(age);
		
		// 변수는 실행하는 순간 영역을 선언하고 끝나면 메모리를 운영체제에 다시 되돌려준다.
	};
	
	// 하나의 메서드(함수)
	public static void test() {
		
	};
	
	// 하나의 메서드(함수)
	public static void test2() {
		
	}
}
