package ex04;

public class Ex01 {
	public static void main(String[] args) {
		// 형변환
		int a = 10;
		double b = 20.2;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c = (int) b;		// 자료형 소실이 일어나기 때문에 강제형 변환이 필요하다.
		double d = a;			// int 보다 double이 더 크기 때문에 자동 변환이 된다.
		
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// 연산자
		System.out.println(a==b);	// 10 == 20.2 -> f
		System.out.println(b==c);	// 20.2 == 20 -> f
		System.out.println(a==d);	// 10 == 10.0 -> t
		
		System.out.println(a==b || a==d);
		System.out.println(a==b && a==d);
	}
}
