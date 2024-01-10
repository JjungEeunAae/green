package ex08;

public class Ex04 {
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("i = " + i);
			
			for(int j = 0 ; j < 10 ; j++) {
				if(j % 3 == 0) {
					continue;
				} else {
					System.out.println("\t j = " + j);
				}
			}
		}
		
		// j가 7일 때 i 값을 증가해라
//		for(int i = 1 ; i <= 10 ; i++) {
//			System.out.println("i = " + i);
//			
//			for(int j = 0 ; j < 10 ; j++) {
//				if(j % 3 == 0) {
//					continue;
//				} else {
//					System.out.println("\t j = " + j);
//				};
//				
//				if(j == 7) {
//					i += 1;
//					System.out.println("\t 발 한번 디뎠다");
//					break;  // j가 7에 도달하면 멈춘다.
//							   // 자식 for문을 종료하고 부모 for문으로 이동
//				};
//			}
//		}
		
	}
}
