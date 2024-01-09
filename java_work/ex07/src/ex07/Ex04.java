package ex07;

public class Ex04 {
	public static void main(String[] args) {
		/* 아래의 모양을 출력하라.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		/*
		 * 첫번째줄에선  1번 반복
		 * 두번째줄에선  2번 반복
		 * 세번째줄에선  3번 반복
		 * 네번째줄에선  4번 반복
		 * 다섯번째줄에선 5번 반복
		 */
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
