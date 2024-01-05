package ex05;

public class Ex02 {
	public static void main(String[] args) {
		char a = 'a';
		for(int i = 0 ; i < 26 ; i++) {
			System.out.println(i + "\t" + a++);
		} // for가 종료되면 메모리상에서 삭제한다
		  // 그렇기 때문에 i를 전역으로 빼면 오류가 난다.
		
		System.out.println();
		
		a = 'A';
		for(int i = 0 ; i < 26 ; i++) {
			System.out.println(i + "\t" + a++);
		}
		
		System.out.println();
		a = '0';
		for(int i = 0 ; i < 26 ; i++) {
			System.out.println(i + "\t" + a++);
		}
	}
}
