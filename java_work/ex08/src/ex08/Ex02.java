package ex08;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String TO_DO_LIST[] = new String[100];
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("할 일 추가 만들어야 함.");
				TO_DO_LIST[0] = "공부";
			} else if(select == 2) {
				System.out.println("할 일 삭제 만들어야 함.");
				TO_DO_LIST[0] = "";
			} else if(select == 3) {
				System.out.println("우선순위 부여.");
			} else {
				System.out.println("error");
				break;	// 조건문을 탈출하는 것이 아닌 반복문을 탈출하는 것
			};
		}
		
		System.out.println(TO_DO_LIST[0]);
	}
}
