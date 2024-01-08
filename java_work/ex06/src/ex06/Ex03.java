package ex06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
	public static void solution(int a) {
		if(a >= 90) {
			System.out.println("A");
		} else if(a >= 80) {
			System.out.println("B");
		} else if(a >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
	
	public static int test() throws FileNotFoundException {
		// 파일에서 읽어오는 방법
		 Scanner sc = new Scanner(new File("src/abc.txt"));
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 return a+b;
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(test());
		/*
		 * 성적을 입력받아 90점 이상이면 A, 80점 이상 B, 70점 이상이면 C, 그 외에 D를 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		solution(sc.nextInt());
		
		int score = sc.nextInt()/10;
		
		switch (score) {
			case 9, 10:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			default:
				System.out.println("D");
				break;
		};
	}
}
