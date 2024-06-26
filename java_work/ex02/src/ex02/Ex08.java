package ex02;

import java.util.Scanner;

// 숫자 두 개의 입력받아 더한 값을 출력하세요.
/*
 * Scanner 안에 있는 함수
 * 	nextInt() : 숫자를 입력받는다.
 *  nextLine(): 문자열을 입력받는다.
 */

public class Ex08 {
	// 두 개의 정수 타입 매개변수를 받고 계산된 정수의 값을 되돌려준다.
	public static int solution(int num1, int num2) {
		num1 = 10;
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====첫번째 숫자 입력====");
		int num1 = sc.nextInt();
		System.out.println("====두번째 숫자 입력====");
		int num2 = sc.nextInt();
		
		int result = solution(num1, num2);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		
		System.out.println(solution(num1, num2));
	}
}
