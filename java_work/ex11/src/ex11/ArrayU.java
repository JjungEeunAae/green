package ex11;

import java.util.Arrays;

public class ArrayU {
	public void sort(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		};
		System.out.println(Arrays.toString(arr));
	};
	
	public void sum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		};
		System.out.println(sum);
	};
	
	public void print(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		};
	};
}
