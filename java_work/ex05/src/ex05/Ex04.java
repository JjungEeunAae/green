package ex05;

public class Ex04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 앞이 F여서 뒷부분을 실행하지 않는다.
		boolean c = a>b && b>(b=30);
		System.out.println(c);
		System.out.println(b);
		System.out.println();
		
		// 앞이 T면 뒷부분을 실행하지 않는다.
		boolean d = a<b || b>(b=30);
		System.out.println(d);
		System.out.println(b);
		System.out.println();

		// 앞이 T면 뒤에 부분을 실행한다.
		boolean e = a<b && b>(b=30);
		System.out.println(e);
		System.out.println(b);
	}
}
