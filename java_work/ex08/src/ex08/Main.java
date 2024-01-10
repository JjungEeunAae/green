package ex08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int productCnt = sc.nextInt();
		int calcu_total = 0;
		
		int[] itemPrice = new int[productCnt];
		int[] itemCnt = new int[productCnt];
		
		// 처음에 입력한 숫자만큼 돌면서 배열 안에 값 넣기
		for(int i = 0 ; i < productCnt ; i++) {
			itemPrice[i] = sc.nextInt();
			itemCnt[i] = sc.nextInt();
		};
		
		// 총 금액 계산
		for(int i = 0 ; i < productCnt ; i++) {
			calcu_total += (itemPrice[i] * itemCnt[i]);
		};
		
		// 입력한 숫자만큼 반복하면서 각 배열안에 들어온 값 출력
		for(int i = 0 ; i < productCnt ; i++) {
			System.out.println("price[i] : " + itemPrice[i]);
			System.out.println("cnt[i] : " + itemCnt[i]);
		};
		
		if(total == calcu_total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
