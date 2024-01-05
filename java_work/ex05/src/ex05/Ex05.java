package ex05;

public class Ex05 {
	public static void main(String[] args) {
		int a = 10;
		// 2진수 : 1010
		//16진수 : 2
		
		System.out.printf("%x\n",a);
		
		// 2진수 : 0010
		System.out.printf("%d\n",a>>2);
		// 2진수 : 1010 & 0010
		System.out.printf("%d",a>>2 & a);
	}
}
