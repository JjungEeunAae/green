package chap04;
class FlowEx19 {
	public static void main(String[] args) { 
		/*
		 * i=1, j=1 -> k=1~3
		 * i=1, j=2 -> k=1~3
		 * i=1, j=3 -> k=1~3
		 * i=2, j=1 -> k=1~3
		 * ...
		 * i=1, j=1 k=1 -> l=1~3
		 */
		for(int i=1;i<=3;i++) {			// 1차원  
			for(int j=1;j<=3;j++) { 	// 2차원
				for(int k=1;k<=3;k++) {	// 3차원
					System.out.print(" "+i+j+k);
				}
				System.out.println();
			}
		}
	}
}
