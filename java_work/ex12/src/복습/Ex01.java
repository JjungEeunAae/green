package 복습;

/*
 *	믹변과 높이를 저장할 수 있는 생성자
 *	믹변과 높이로 높이를 구하는 메서드 
 */

public class Ex01 {
	public static void main(String[] args) {
		// 기본생성자 호출해서 클래스를 메모리에 올린다.
		Tri t = new Tri(10,20);
		Tri t2 = new Tri();
		
		System.out.println(t);
		System.out.println(t2);
		
		// 넓이 구하는 메서드 호출
		System.out.println(t.area());
		System.out.println(t2.area());
	};
};
