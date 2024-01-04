package ex03;

public class Ex08 {
	public static void main(String[] args) {
		/* int -> char
		 * unicode A => 65
		 * 65 => A
		 * 실수 -> 정수
		 * double -> int : 소수점을 버리고 형변환된다.
		 */
		double d = 85.4d;
		int score = (int)d;
		System.out.println("score = " + score);
		System.out.println("d = " + d); 
		
		 /*
		 * 정수 -> 실수
		 * 10 -> 10.0
		 * 20 -> 20.0
		 * 
		 * 비트 체계가 작은거에서 큰걸로 바꿀 때는 자료의 소실이 없기 때문에 안적어도 자동 형변환이 가능하다.
		 */
		 int aa = 10;
		 double ee = aa;
		 System.out.println("aa = " + aa);
		 System.out.println("ee = " + ee);
	}
}
