package ex01;

public class Programmers {
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,4};
		System.out.println(solution(arr));
    }
	
	public static int solution(int[] array) {
        int answer = 0; // 최빈값
        int max = 0;
        int count[] = new int[array.length];	// 값별 개수 카운트 배열
        
        for(int i = 0 ; i < array.length ; i++) {
        	count[array[i]]++;
        	System.out.println(count[array[i]]);
        	if(max < count[array[i]]) {	// 배열의 값이 max보다 크면 해당 값을 최빈값으로 지정
        		max = count[array[i]];
        		answer = array[i];
        	};
        };
        int temp = 0;	// 최빈값 두개 이상이면 -1 return
        for(int i = 0 ; i < array.length ; i++) {
        	if(max == count[i]) {
        		temp++;
        		if(temp > 1) {
        			answer = -1;
        		}
        	}
        }
        return answer;
	}
}