package ex07;

public class Ex08 {
	public static void main(String[] args) {
		// 라벨 : a의 값을 넘겨버린다.
		for(int a = 0 ; a < 5 ; a++) {
			for(int i = 0 ; i < 5 ; i++) {
				
				if(i == 2) {
					continue;
				}
				System.out.println(i);
			}
		}
	
	}
}
