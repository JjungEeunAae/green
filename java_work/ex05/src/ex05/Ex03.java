package ex05;

public class Ex03 {
	public static void main(String[] args) {
		// 같은 영역을 가르킨다.
		String a = "abc";
		String b = "abc";
		String c = "abc";
		// 새로운 영역을 만든다.
		String d = new String("abc");
		
		// 같은 영역의 값을 비교하기 때문에 true가 나온다.
		System.out.println(a==b);
		// 서로 다른 영역을 비교하기 때문에 false가 나온다.
		System.out.println(c==d);
		System.out.println();
		// 값(문자열) 비교
		System.out.println(c.equals(d));
	}
}
