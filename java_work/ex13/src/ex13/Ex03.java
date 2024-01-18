package ex13;

class AA {
	public void doPrint() {
		System.out.println("static doPrint()");
	}
}

class AAA {
	public static AA aa = new AA();
	
	public void doA() {
		System.out.println("AAA doA");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		AAA aa = new AAA();
		
		aa.doA();
		
		// 클래스명+인스턴스변수+메서드
		// aa는 AAA에서 static이기 때문임
		AAA.aa.doPrint();
		
		System.out.println("테스트");
		
		
	};
}
