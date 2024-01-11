package ex09;

import java.util.Arrays;

public class Ex06 {
	/* 랜덤한 숫자(0~9) 10개를 배열로 담아 나온 수의 개수를 적으시오.
	 * 
	 */
	public static void main(String[] args) {
//		int[] arr = new int[10];
//		int[] cntArr = new int[10];
//		
//		for(int i = 0 ; i < 10 ; i++) {
//			arr[i] = (int)(Math.random() * 10);
//		};
//		System.out.println(Arrays.toString(arr));	// 배열 확인
//		
//		int cnt = 0;
//		int tNum = 0;
//		for(; tNum < 10 ; tNum++) {
//			for(int i = 0 ; i < 10 ; i++) {
//				if(tNum == arr[i]) {
//					cnt++;
//				};
//			};
//			cntArr[tNum] = cnt;
//			cnt = 0;
//		};
//		
//		System.out.println();
//		System.out.println(Arrays.toString(cntArr));
//		
//		for(int i = 0 ; i < 10 ; i++) {
//			System.out.print(i + "=" + cntArr[i] + " ");
//		}
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			
			for(int j = 0 ; j < i ; j++) {	// 중복제거
				if(arr[i] == arr[j]) {
					i--;
					break;
				};
			}
		};
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
