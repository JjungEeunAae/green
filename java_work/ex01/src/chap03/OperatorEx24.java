package chap03;
class OperatorEx24 {
	public static void main(String args[]) { 
		/*
		 * c      : 코드량 많음, 속도 빠름
		 * java   : 코드량이 c보다는 작음, 속도 빠름
		 * python : 코드량이 세개 중에 제일 작음, 실행속도 세개중에 제일 느림(컴파일이 일을 많이 함) 
		 */
		int  x = 0;
		// '' : null, ' ' : 스페이스 값이 들어있음 
		char ch = ' ';

		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 =%b\n", x, 10 < x && x < 20);

		x = 6;
		System.out.printf("x=%2d,  x%%2==0 || x%%3==0  && x%%6!=0 =%b\n", x, x%2==0||x%3==0&&x%6!=0);
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b\n", x,(x%2==0||x%3==0)&&x%6!=0);

		ch='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b\n", ch, '0' <= ch && ch <='9');
		/* 문자는 유니코드로 변경되기 때문에 비교연산자가 가능하다.
		 * 문자열은 유니코드로 변경되지 않기 때문에 비교연산자(== 제외)가 불가하다.
		 */
		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b\n", ch, 'a' <= ch && ch <='z');

		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b\n", ch, 'A' <= ch && ch <='Z');

		ch='q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b\n", ch, ch=='q' || ch=='Q');
	}
}
