package ex07;

public class Ex08 {
	public static void main(String[] args) {
		aa:for(int a = 0 ; a < 5 ; a++) {
			for(int i = 0 ; i < 5 ; i++) {
				
				if(i == 2) {
					continue aa;
				}
				System.out.print(i);
			};
			System.out.println();
		}
	
	}
}
