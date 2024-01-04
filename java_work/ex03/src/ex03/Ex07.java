package ex03;

public class Ex07 {
	public static void main(String[] args) {
		char aa = 'A';
		System.out.println(aa);
		System.out.println((int)aa);
		int bb = (int) aa;
		System.out.println(bb);
		char cc = (char) bb;
		System.out.println(cc);
		
		// 1byte -128 ~ +127
		// 오버플로우 : 지정된 범위를 벗어나는 것
		byte kk = 127;
		// int형 연산으로 되기 때문에 정상적인 연산이 된다.
		System.out.println(kk + 1);
		// 오버플로우. 원하지 않는 값이 나온다.
		System.out.println((byte)(kk + 1));
	}
}
