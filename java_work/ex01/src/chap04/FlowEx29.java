package chap04;
class FlowEx29 {
	public static void main(String[] args) { 
		for(int i=1;i<=10;i++) {
			System.out.printf("i=%d ", i);

			int tmp = i;

			do {
				if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					System.out.print(" 3의 배수다!");
				};
				
				tmp /= 10;
				System.out.println("tmp >> " + tmp);
				
			} while(tmp != 0);
		}
	}
}
