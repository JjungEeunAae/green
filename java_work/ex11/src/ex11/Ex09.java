package ex11;

public class Ex09 {
	public static void main(String[] args) {
//		int result = fact(5);
//		System.out.println(result);
		
		// 재귀함수를 사용해서 doA(5)을 호출하면 2*2*2*2*2가 되도록 만들어라
		System.out.println(doA(5));
	};
	
	public static int fact(int num) {
		if(num > 0) {
			return num * fact(num-1);
		} else {
			return 1;
		}
	};
	
	public static int doA(int num2) {
		if(num2 > 0) {
			return 2 * doA(num2 - 1);
		} else {
			return 1;
		}
	};
}
