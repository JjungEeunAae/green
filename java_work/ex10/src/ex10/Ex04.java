package ex10;

public class Ex04 {
	public static void main(String[] args) {
		TV[] tv = new TV[10];
		
		System.out.println(tv[0]);
		System.out.println(tv[1]);
		System.out.println(tv[2]);
		System.out.println();
		
		// error (NullPointException)
		// System.out.println(tv[0].channel);
		// System.out.println(tv[1].power);
		// System.out.println(tv[2].color);
		/*
		 * error인 이유는 tv라는 배열의 각 방에 null로 되어있기 때문이다.
		 * 
		 * 배열은 기본형 타입에 배열이면 0으로 초기화하고, 참조형타입은 null 값으로 초기화한다.
		 */
		
		// int 객체
		int[] a = new int[10];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println();
		
		// int를 null 값으로 처리가 가능하다.
		// null 값으로 처리가 가능해 SQL에 용이하게 쓰인다.
		Integer[] b = new Integer[10];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println();
		
		// String 객체
		String[] c = new String[10];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println();
		
		
		// 해결방법 - 인스턴스화(메모리에 올린다)
		for(int i = 0; i < tv.length ; i++) {
			tv[i] = new TV();
			System.out.println(tv[i]);
		};
	}
}
