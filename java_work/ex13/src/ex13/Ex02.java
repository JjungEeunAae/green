package ex13;

public class Ex02 {
	public static void main(String[] args) {
		InstClass ic = new InstClass();	// num = num + 1 된 값임
		
		System.out.println(ic.num++);	      // num = 2
		System.out.println(InstClass.num++); // num = 3
		
		System.out.println(InstClass.num);	// num 값 출력
	}
}
