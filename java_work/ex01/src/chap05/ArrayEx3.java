package chap05;
class ArrayEx3{
	public static void main(String[] args) {
		int[] arr = new int[5];

		// 배열의 arr에 1~5를 저장한다.
		for(int i=0; i < arr.length;i++) { 
			arr[i] = i + 1;
		};
		System.out.println("[변경전] arr.length: "+arr.length);
		for(int i=0; i < arr.length;i++) { 
			System.out.print("arr["+i+"]:"+arr[i] + ", ");
		};
		System.out.println();

		// 배열의 길이를 두배로 증가시켰다.
		int[] tmp = new int[arr.length*2];

		// 자바에서는 배열선언과 동시에 모든 값을 0으로 초기화
		for(int i=0; i < arr.length;i++) {
			tmp[i] = arr[i];
		};

		arr = tmp;	// 해당되는 주소를 가르킨다. 

		System.out.println("[변경후] arr.length:"+arr.length);	
		for(int i=0; i < arr.length;i++) {
			System.out.print("arr["+i+"]:"+arr[i] + ", ");
		};
	}
}
