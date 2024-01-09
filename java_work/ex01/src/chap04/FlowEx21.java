package chap04;
class FlowEx21 {
	public static void main(String[] args) { 
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);			
				} else {
					// 문자를 5번 실행해라
					System.out.printf("%5c", ' ');
					// 위의 코드를 대신 할 수 있다
					// System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
