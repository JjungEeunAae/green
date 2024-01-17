package ex12;

class CapA {
	public void take() {
		System.out.println("CapA 약목음 기침 나옴");
	}
};

class CapB {
	public void take() {
		System.out.println("CapA 약목음 콧물 나옴");
	};
};

class CapC {
	public void take() {
		System.out.println("CapA 약목음 열 안남");
	};
};

class ColdPatient {
	// 캡슐화가 무너진 예
	void takeA(CapA a) {
		a.take();
	};
	
	void takeB(CapB b) {
		b.take();
	};
	
	void takeC(CapC c) {
		c.take();
	};
	
	// 매개로 다른 클래스를 받아와 캡슐화시킨 후 이용한다.
	void takeAll(CapA a, CapB b, CapC c) {
		a.take();
		b.take();
		c.take();
	};
}

public class Ex05 {
	public static void main(String[] args) {
		ColdPatient co = new ColdPatient();
		// 캡슐화의 잘못된 예시
		// 캡슐화가 무너지면 클래스들의 순서가 뒤죽박죽이다.
		co.takeA(new CapA());
		co.takeB(new CapB());
		co.takeC(new CapC());
		
		// 캡슐화의 올바른 예시
		co.takeAll(new CapA(), new CapB(), new CapC());
	}
}
