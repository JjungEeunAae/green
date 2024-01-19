package ex14;

public class Ex05 {
	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		
		System.out.println(a+b);
		System.out.println(a.concat(b));
		
		System.out.println(a.substring(1));
		System.out.println("adasef".substring(0,4));
		
		String c = "ㅇㄷㅇㄷ";
		String d = "ㅇㄷㅇㄷ";
		
		// 동일하면 0 출력
		System.out.println(c.compareTo(d));
		// 뒤에가 더 크면 -1 출력
		System.out.println("A".compareTo("B"));
		// 앞이 더 크면 1 출력
		System.out.println("B".compareTo("A"));
	}
}
