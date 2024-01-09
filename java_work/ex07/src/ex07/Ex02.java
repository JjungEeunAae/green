package ex07;

public class Ex02 {
	public static void doA() {
		System.out.println("doA 매개변수 없는 함수");
		return;
	}
	
	public static void doB(int a) {
		System.out.println("doA 매개변수 a = " + a);
		if(a == 10) {
			System.out.println("if 구역");
			return;
		} else if(a == 8) {
			System.out.println("else if 구역");
			return;
		}
		
		System.out.println("if구문을 가지못했다");
		
		return;
	}
	
	public static int doC(int a) {
		return a*a;
	}
	
	public static String doD(int a) {
		return Integer.toString(a+10);
	}
	
	public static boolean doE(String str) {
		boolean result = true;
		
		if(str.length() != 4) {
			result = false;
		}
		
		return result;
	}
	
	public static void doF() {
		System.out.println("abcdef".substring(3));
		System.out.println("abcdef".substring(3,5));
	}
	
	public static void main(String[] args) {
//		doA();
//		doB(11);
//		System.out.println(doC(3));
//		System.out.println(doD(10));
//		System.out.println(doE("134"));
		doF();
	}
}
