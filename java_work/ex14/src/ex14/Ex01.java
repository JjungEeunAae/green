package ex14;

public class Ex01 {
	Ex01() {
		System.out.println("기본생성자");
	};
	
	Ex01(int a, int b) {
		System.out.println(a+b);
	};
	
	Ex01(String s) {
		System.out.println(s);
	};
	
	public static void main(String[] args) {
		new Ex01();
		new Ex01(1,2);
		new Ex01("hi");
	}
	
}
