package ex09;

import java.util.Arrays;

public class Ex03 {
	public static void solution(int[] temp) {
		temp[0] = 100;
		System.out.println("solution : " + Arrays.toString(temp));
	};
	
	public static void doA(int temp) {
		temp = 200;
		System.out.println("doA : " + temp);
	};
	
	public static void main(String[] args) {
		// 배열의 규칙
		int[] a = {1,2,3,4,5};
		int[] b = a;	// b는 a의 배열 주소값을 공유한다.
		
		System.out.println("main : " + Arrays.toString(a));
		solution(a);
		
		
		int c = 100;
		doA(c);
		System.out.println("main : " + c);
	};
}
