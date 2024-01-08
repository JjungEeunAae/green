package ex06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간 입력");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		// hour을 24가 아닌 0으로 입력하면 24로 맞춰주기
		if(hour == 0) {
			hour = 24;
		}
		// 10분-45분
		// 45분 이상이면 min을 그냥 빼면 되고, 아니면 hour를 1 빼주고, min을 60 더하고 45를 뺀다.
		if(min < 45) {
			hour -= 1;
			min = (min+60) - 45;
		}
		
		
		System.out.println(hour + "시 " + min + "분");
	}
}
