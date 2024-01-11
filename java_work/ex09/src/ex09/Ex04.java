package ex09;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		/* 버블정렬
		 * {100, 90, 60, 40, 120}
		 * 오름차순 : {40, 60, 90, 100, 120}
		 * 내림차순 : {120, 100, 90, 60, 40}
		 * 
		 * 1회전 : 5개 비교
		 * { 100,90,60,40,120 } 기초
		 * { 90,100,60,40,120 } 0
		 * { 90,60,100,40,120 } 1
		 * { 90,60,40,100,120 } 2
		 * 
		 * 2회전 : 4개 비교
		 * { 60,90,40,100,120 }
		 * { 60,40,90,100,120 }
		 * 
		 * 3회전 : 3개 비교
		 * { 40,60,90,100,120 }
		 */
		
		int[] arr2 = { 100, 90, 60, 40, 120 };

		for (int i = 0; i < 5 - i; i++) {
			for (int j = 0; j < 5 - j; j++) {
				if (arr2[j] > arr2[j + 1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
