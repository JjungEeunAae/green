package ex08;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		int[] int_arr = {1,2,3,4,5,6};
		// 기본 for문
		for(int i = 0 ; i < int_arr.length ; i++) {
			System.out.println(int_arr[i]);
		};
		
		System.out.println();
		
		String a = "반가워요";
		String b = "안녕하세요";
		
		// 향상 for문
		for(char i : a.toCharArray()) {
			System.out.println(i);
		};
		
		System.out.println();
		
		// a에 담긴 문자열에서 문자를 하나씩 땐 다음 배열로 만든다.
		char[] bArr = b.toCharArray();
		
		for(char i : bArr) {
			System.out.println(i);
		};
		
		System.out.println(); 
		
		// for 람다 표현식
		List<String> fruits = Arrays.asList("apple", "banana", "orange");
		fruits.forEach(fruit -> {
			System.out.println(fruit);
		});
		
	}
}
