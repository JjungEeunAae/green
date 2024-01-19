package ex14;

public class AA {
	public int doC() {
		return 10;
	}
	
	public void doA() {
		System.out.println("doA 함수");
	}
	
	public void doA(int a, int b) {
		System.out.println(a*b);
	}
	
	public void doA(String c) {
		System.out.println(c);
	}
	
	public static void doB() {
		System.out.println("doB 함수");
	}
	
	public static void doB(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void doB(String c) {
		System.out.println(c);
	}
}
