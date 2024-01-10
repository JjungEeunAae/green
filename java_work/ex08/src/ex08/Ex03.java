package ex08;

/* 1~46
 * 무작위로 숫자3 개를 꺼내서 같은 숫자가 나오면 true 출력, 아니면 false
 */
public class Ex03 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = (int)(Math.random() * 45) + 1;
		b = (int)(Math.random() * 45) + 1;
		c = (int)(Math.random() * 45) + 1;
		System.out.println("a >> " + a);
		System.out.println("b >> " + b);
		System.out.println("c >> " + c);
		
		if(a == c && a == b) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}
}
