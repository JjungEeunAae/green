package chap05;
class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		// numArr 배열 각 방에 값 넣기
		for (int i=0; i < numArr.length ; i++ ) {
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i] + " ");
		}
		System.out.println();

		for (int i=0; i < numArr.length-1 ; i++ ) {
			boolean changed = false;
			
			// numArr 값 출력하는 반복문
			for (int j=0; j < numArr.length-1-i ;j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			} // end for j

			if (!changed) break;

			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]);
			
			System.out.println();
		} // end for i
	}
}
