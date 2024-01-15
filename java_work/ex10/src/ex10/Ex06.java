package ex10;

public class Ex06 {
	// 생성자와 메서드의 차이
	/* 생성자는 return 되는 값이 안적혀있다.
	 * 메서드는 return 되는 값이 적혀있다.
	 */
	
	// doA 메서드의 return 값은 void이다.
	// 클래스 함수는 인스턴스화 해야지만 사용할 수 있다.
	public void doA() {
		System.out.println("doA 메서드입니다.");
	};
	
	// static은 메모리 공간에 항상 상주한다.
	public static void doB() {
		System.out.println("doB 메서드입니다.");
	};
	
	// 기본 생성자 : 자동으로 생성해주기 때문에 생략가능하다. 
	public Ex06() {
		System.out.println("기본 생성자");
	};
	
	public static void main(String[] args) {
		new Ex06();				// 기본 생성자는 참조변수를 생략가능하다.
		Ex06.doB();				// static method 호출
		Ex06 ex = new Ex06();	// 인스턴스 선언
		ex.doA();				// 인스턴스 함수 호출
	};
}
