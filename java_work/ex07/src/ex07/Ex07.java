package ex07;

public class Ex07 {
	public static int solution(int[] array) {
		int answer = 0;
		int[] realArr = new int[array.length];	// 방만 만들었을 뿐 각 방엔 값은 없다.
		int[] cntArr = new int[array.length];
		
		int rcnt = 0;
		// 시작하기 전에 realArr에 있는건 비교조차 안해야 함.
		for(int i = 0 ; i < realArr.length ; i++) {
			int cnt = 0;
			
			for(int j = 0 ; j < realArr.length ; j++) {
				// 하나라도 같은게 있으면 바깥 for문으로 이동
				if(array[i] == realArr[i]) {
					System.out.println("i가 넘어가야함.");
					cnt++;
				};
			};
			
			if(cnt == 0) {
				realArr[rcnt++] = array[i];
			};
		};
		
		rcnt = 0;
		for(int i = 0 ; i < realArr.length ; i++) {
			int cnt = 0;
			for(int j = 0 ; j < realArr.length ; j++) {
				if(realArr[i] == array[j]) {
					cnt++;
				}
			};
			cntArr[rcnt++] = cnt-1;
		}

		// 최빈값 구하기
		int max = cntArr[0];
		for(int i = 1 ; i < cntArr.length ; i++) {
			if(max < cntArr[i]) {
				max = cntArr[i];
			}
		}
		System.out.println("max >>> " + max);
		
		// test
		for(int i = 0 ; i < cntArr.length ; i++) {
			if(cntArr[i] == 0 || cntArr[i] == -1) {
				continue;
			}
			if(max == cntArr[i]) {
				max = -1;
			}
		};
		
		return max;
	} 
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,3,3,4};
		int arr2[] = {1,1,2,2};
		int arr3[] = {1};
		
		System.out.println("결과값은 " + solution(arr1) + " 입니다.");
//		System.out.println();
//		System.out.println(solution(arr2));
//		System.out.println();
//		System.out.println(solution(arr3));
	}
}
