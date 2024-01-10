package chap05;
import java.util.*;

class ArrayEx2 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		// i+1 한 값을 iArr1 배열의 각 방에 집어넣기
		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1;
		};

		// 1~10 까지의 랜덤 값을 iArr2 배열의 각 방에 집어넣기
		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*10) + 1;
		};

		// iArr1 배열 안에 있는 값 출력하기
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	
		};
		
		System.out.println();
		// Arrays.toString : 8버전에 나온 메소드, 배열의 값을 문자로 출력
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);	// 배열의 주소값이 출력
		System.out.println(chArr);	// chArr의 배열은 String으로 바로 출력가능하다.
		
		// replace : 특정 문자 자르기
		String a = "[123456]";
		a = a.replace("[", "");
		a = a.replace("]", "");
		System.out.println("\n\n" + a + "\n\n");
		
		// 메소드 체인 방법 : 8버전 이전에는 해당 방법이 불가했음
		//				   메소드를 한줄에 이어서 사용한다.
		System.out.println(Arrays.toString(iArr1).replace("[", "").replace("]", ""));
	}
}
