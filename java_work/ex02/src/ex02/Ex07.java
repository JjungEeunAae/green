package ex02;

import java.util.Scanner;
class AA {
	public void doA () {
		System.out.println("AA.doA()");
	}
}
public class Ex07 {
	public static void main(String[] args) {
		int a = 10;								// 기본형 타입 변수 선언
		Scanner sc = new Scanner(System.in);	// 참조형 타입 변수 선언

		// Scanner 활용
		System.out.print("입력 >>> ");
		String inputString = sc.nextLine();
		System.out.println(inputString);

		// 참조형 타입 변수 선언
		AA aa = new AA();
		aa.doA();
	}
}
