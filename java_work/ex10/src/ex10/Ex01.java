package ex10;


public class Ex01 {
	// 배열 출력하는 함수
	public static void doPrintArr(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = (int)(Math.random() * 100) +1;
			}
		}
		
		// 만들어진 배열 출력
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	};
	
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[][] brr = new int[5][5];
		
		doPrintArr(arr);
		System.out.println();
		doPrintArr(brr);
	}
}
