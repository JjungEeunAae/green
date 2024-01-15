package ex01;

import java.util.*;

public class Programmers {
	public static void main(String[] args) {
		new Programmers();
	}
	
	public Programmers() {
		System.out.print(solution(3,10));
	}
	
	// 수정부분
	public int[] solution(int start_num, int end_num) {
		int[] answer = new int[end_num - start_num + 1];
		
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = i + start_num;
		}
		
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	
}