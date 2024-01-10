package ex08;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] crr = new int[arr.length];	// 새로운 메모리에 안착
		int[] brr = arr;	// 새로운 배열에 arr의 주소값을 참조하라고 공유해준거임
		
		for(int i = 0; i < arr.length ; i++) {
			crr[i] = arr[i];
		};
		
		arr[0] = 100;
		int[] drr = Arrays.copyOf(arr, arr.length);
		
		System.out.println("a > " + Arrays.toString(arr));
		System.out.println("b > " + Arrays.toString(brr));
		System.out.println("c > " + Arrays.toString(crr));
		System.out.println("d > " + Arrays.toString(drr));
		
	}
}
