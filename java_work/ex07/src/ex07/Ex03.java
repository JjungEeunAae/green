package ex07;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; ; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println(b+c);
			
			if(b == 0 && c == 0) {
				break;
			};
		};
	}
}
