package codeReview;

import java.util.Arrays;

// 프로그래머스 문제: 수열과 구간쿼리 3(No.181924)
class Solution {
	public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0 ; i < queries.length ; i++) {
        	int tmp = arr[queries[i][0]];				// 첫번째 방의 값 tmp 저장
        	arr[queries[i][0]] = arr[queries[i][1]];	// 첫번째 방에 두번째 방 값 저장
        	arr[queries[i][1]] = tmp;					// 두번째 방에 tmp에 저장해둔 값 주입
        }
        return arr;
    }
};

public class Main {
	// Main의 기본생성자
	public Main() {
		Solution s = new Solution();
		
		int[] arr = {0, 1, 2, 3, 4};
		int[][] two_arr = {{0,3},{1,2},{1,4}};
		
		System.out.println(Arrays.toString(s.solution(arr, two_arr)));
	};

	public static void main(String[] args) {
		new Main();		// 기본생성자 호출
	};
}
