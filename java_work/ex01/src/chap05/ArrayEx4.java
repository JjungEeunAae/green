package chap05;

import java.util.Arrays;

class ArrayEx4 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);

		char[] result = new char[abc.length+num.length];
		
//		int resultIndex = 2;
//		System.out.println(result.length);
//		for(int i = 0 ; i < abc.length ; i++) {
//			result[resultIndex++] = abc[i];
//		};
//		
//		System.out.println(Arrays.toString(result));
		
		/* System.arraycopy :
		 *	(원본, 원본 소스 읽어올 위치,
		 *   원본을 넣을 대상, 대상에 원본을 복사할 위치,
		 *   원본에서 복사본으로 데이터를 읽어서 쓸 데이터 길이);
		 */
		System.arraycopy(abc, 0, result, 2, abc.length);
		System.out.println(result);
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		
		
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);

		System.arraycopy(abc, 0, num, 0, abc.length);	
		System.out.println(num);

		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
}
