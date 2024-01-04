package ex03;

import java.util.Scanner;

/*
 *	string 5 
 *	 : "string"을 5번 반복하여 출력하시오
 * 	 : stringstringstringstringstring
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		// string method : repeat(int n);
		// 	ㄴ매개변수로 들어가는 숫자만큼 반복한다.
		System.out.println(str.repeat(n));
		
		// i를 n만큼 반복하여 실행한다.
		for(int i = 0 ; i < n ; i++) {
			System.out.print(str);
		};
	}
}
