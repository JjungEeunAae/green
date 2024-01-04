package ex04;

public class Ex04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		
		byte c = (byte)(a*b);
		System.out.println(c);
		
		int d = 1000000;
		int e = 2000000;
		
		// int가 받을 수 있는 결과값이 아니기 때문에 long으로 타입 변환
		long f = (long)d * e;
		System.out.println(f);
		
		long g = 10000000 * 10000000;
		long h = 10000000 * 10000000L;
		// 원하는 값이 나오지 않음
		System.out.println("g = " + g);
		// 정상출력
		System.out.println("h = " + h);
	}
}
