package chap04;
class FlowEx31 {
	public static void main(String[] args) {
		// 3의 배수를 출력하라
		for(int i=0;i <= 10;i++) {
			if (i%3==0) {
				System.out.println(i + "일 때 continue를 만남");
				continue;
			}
			System.out.println(i);
		};
		
		// 4의 배수를 출력하라
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 4 == 0) {
				System.out.println(i + " : continue");
				continue;
			}
			
			System.out.println(i);
		}
	}
}
