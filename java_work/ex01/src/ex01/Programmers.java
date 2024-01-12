package ex01;

import java.util.*;

public class Programmers {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] arr_two = {{0,4,2},{0,3,2},{0,2,2}};
        System.out.println(solution(arr,arr_two));
	
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int[30];
		
		for(int i = 0 ; i < 28 ; i++) {
			x[sc.nextInt()-1] = 1;
		};
		System.out.println(Arrays.toString(x));
//		
//		for(int i = 0 ; i < x.length ; i++) {
//			if(x[i] == 0) {
//				System.out.println(i+1);
//			}
//		}
		
    }
	
	public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        // [시작위치, 배열을 끝낼 위치, 이 자리에 있는 숫자보다 크면서 가장 작은 값]
        for(int i = 0 ; i < queries.length ; i++) {
        	int min = 1000000;
        	int cnt = 0;
        	for(int j = queries[i][0] ; j < queries[i][1]+1 ; j++) {
        		// k보다 큰놈만 뽑아
        		if(arr[j] > queries[i][2]) {
        			if(min > arr[j]) {
        				min = arr[j];
        			}
        		} else {
        			cnt++;
        		};
        		
        		System.out.println("min " + min);
        	};
        	
        	System.out.println(i + ", " + "min, " + min + ", cnt " + cnt);
//        	System.out.println("cnt > " + cnt );
//        	System.out.println("계산값 : " + (queries[i][1]-queries[i][0]+1));
        	if(queries[i][1] - queries[i][0] + 1 == cnt) {
        		answer[i] = -1;
        	} else {
        		answer[i] = min;
        	}
        }
//        System.out.println(Arrays.toString(answer));
        return answer;
    }
}