package ex10;

public class Ex08 {
	
	public Ex08() {
		System.out.println("기본생성자");
	};
	
	public static void doA() {
		System.out.println("static 함수");
	};
	
	public void doB() {
		System.out.println("non-static 함수");
	};

	public static void main(String[] args) {
		// 기본생성자 호출
		new Ex08();
		// +참조변수
		Ex08 ex = new Ex08();
		
		// static
		doA();		
		Ex08.doA();		// 클래스명을 통해 호출된 클래스변수(자바 권장 방식)
		
		Ex08 ex2 = new Ex08();
		ex2.doA();		// 참조변수를 통해 호출된 클래스변수(자바 비권장 방식)
		
		// non-static
		// doB();		error!
		// Ex08.doB();	error!
		Ex08 ex3 = new Ex08();	// 인스턴스 선언
		ex3.doB();				// 참조변수를 통한 인스턴스 변수 활용
	}
}
