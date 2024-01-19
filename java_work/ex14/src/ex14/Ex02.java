package ex14;

public class Ex02 {
	public static void main(String[] args) {
		AA aa = new AA();
		
		aa.doA();
		aa.doA(3, 2);
		aa.doA("문자출력");

		System.out.println();
		
		AA.doB();
		AA.doB(5, 10);
		AA.doB("doB");
	}
}
