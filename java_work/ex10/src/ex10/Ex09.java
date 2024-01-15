package ex10;

import java.util.Scanner;

public class Ex09 {
	public int solution(int num1, int num2, String yon) {
		int result = 0;
		
		switch (yon) {
			case "+": 
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default :
				System.out.println("사칙연산 외 다른걸 입력하였습니다.");
		};
		
		return result;
	}
	
	public static void main(String[] args) {
		new Ex09();
	}

	public Ex09() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력 >> ");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력 >> ");
		String yon = sc.next();
		
		// System.out.println("num1(" + num1 + "), num2(" + num2 + "), yon(" + yon + ")");
		System.out.println(solution(num1, num2, yon));
	}
}
