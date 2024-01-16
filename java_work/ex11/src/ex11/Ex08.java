package ex11;

public class Ex08 {
	public static void main(String[] args) {
		doAdd(19,20);

		divide(20,0);
	};
	
	public static int doAdd(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}
	
	public static int divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("못나눔");
			return 0;
		}
		int result = num1 / num2;
		System.out.println(result);
		return result;
	}
}
