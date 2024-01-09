package ex07;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		// 기본 for문
		for(int i = 0; i < arr.length ; i++) {
//			System.out.println(arr[i]);
		}
		
		int sum = 0;
		// 향상 for문
		for(int i : arr) {
//			System.out.println(i);
			sum += i;
		};
		
		System.out.println(sum);
		
		String[] str_arr = {"aa", "bb", "cc", "dd"};
		for(String i : str_arr) {
//			System.out.println(i);
		}
	}
}
