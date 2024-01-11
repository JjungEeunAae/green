package ex09;

public class Ex02 {
	// 프로그래머스 원소들의 곱과 합
	// https://school.programmers.co.kr/learn/courses/30/lessons/181929
	public static int solution(int[] num_list) {
		int answer = 0;
		int a = 1;
		int b = 0;
		
		for(int i : num_list) {
			a *= i;
			b += i;
		};
		
		answer = (a < b * b) ? 1 : 0;
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 합의 제곱과 모든 원소의 곱 확인해보기
		int[] arr =  {5,7,8,3};
//		int test1 = 1;
//		int test2 = 0;
//
//		for(int i : arr) {
//			test1 *= i;
//			test2 += i;
//		}
//		System.out.println(test1);
//		System.out.println(test2*test2);
		
		System.out.println(solution(arr));
	}
}
