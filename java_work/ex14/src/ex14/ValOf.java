package ex14;

public class ValOf {
	public static void main(String[] args) {
		int a = 10;
		double b = 2.05;
		String c = String.valueOf(a);
		String d = String.valueOf(b);
		
		System.out.println(c);
		System.out.println(d);
		
		String e = a + "";
		System.out.println(c);
		System.out.println(d);
	}
}
