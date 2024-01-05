package chap03;
class OperatorEx31 {
	public static void main(String[] args) {
		int dec  = 1234; 
		int hex  = 0xABCD;	// 16진수
		int mask = 0xF;		// 16진수
		/*
		 *  %X : 16진수 출력 
		 *  %d : 10진수 출력
		 */
		System.out.printf("hex=%X%n", hex);
		// & : 비트 연산의 '그리고'를 뜻함
		System.out.printf("%X%n", hex & mask);
		System.out.printf("%d%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	} // main�� ��
}
