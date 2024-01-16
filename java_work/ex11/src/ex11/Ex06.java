package ex11;

class A {
	public void doA() {
		System.out.println("A 안에 있는 doA 함수");
	}
};

class B {
	public void doB() { 
		System.out.println("B 안에 있는 doB 함수");
	}
};

class C {
	public void doC() { 
		System.out.println("C 안에 있는 doC 함수");
	} 
};

public class Ex06 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.doA();
		b.doB();
		c.doC();
	}
}
