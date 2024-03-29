package ex03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		/*
		 * 실수는 소수 두번째
		 * 숫자를 입력받아 소수 둘째자리까지만 출력해라
		 * 
		 * ex) 23.456 -> 23.45
		 * 	   11.132 -> 11.13
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		
		/* Scanner method
		 * next         -> 빈공백전까지 문자열 입력
		 * nextLine()   -> 문자열 한줄 입력
		 * nextInt()    -> 정수입력
		 * nextDouble() -> 실수 입력
		 */ 
		double d = sc.nextDouble();
		
		System.out.println("d = " + d);
		
		/* 45.152152 * 100
		 * 4515.2152 -> int
		 * 4515 / 100.0 -> double
		 * 45.15
		 */
		int trans_d = (int)(d*100);
		System.out.println("trans_d = " + trans_d);
		double trans_dd = trans_d / 100.0;
		System.out.println("trans_dd = " + trans_dd);
	}
}
