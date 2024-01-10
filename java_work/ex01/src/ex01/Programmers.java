package ex01;

import java.util.Arrays;

public class Programmers {
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		System.out.println(solution(arr));
    }
	
    public static String solution(int[] numLog) {
        String answer = "";
        int a = 0;
        for(int i = numLog.length-1 ; i > 0 ; i--) {
        	// 
//        	System.out.print("numLog[i] : " + numLog[i] + ", ");
//        	System.out.print("numLog[i+1]  " + numLog[i-1] + " ");
        	// numLog[i] 값이 numLog[i-1] 값 보다 클 때
        	if(numLog[i] > numLog[i-1]) {
//        		System.out.println(">>>> i가 i-1 값이 더 크다!!!");
        		
        		// numLog[i]와 numLog[i-1] 차이가 몇이냐를 알아야 한다.
//        		System.out.print("여길봐!!!!>>>   " + numLog[i] + "\n");
        		if(numLog[i] - 1 == numLog[i-1]) {
//        			System.out.println("numLog[i] - 1 >> " + (numLog[i] - 1) + "\n");
        			answer += "w";
        		} else if(numLog[i] - 10 == numLog[i-1]) {
//        			System.out.println("numLog[i] - 10 >> " + (numLog[i] - 10) + "\n");
        			answer += "d";
        		} 
        	} else {
//        		System.out.println(">>>> i가 i-1 값이 더 작다");
        		if(numLog[i] + 10 == numLog[i-1]) {
        			answer += "a";
        		} else if(numLog[i] + 1 == numLog[i-1]){
        			answer += "s";
        		};
        	}
        };
        char[] test = answer.toCharArray();
        StringBuilder tmp = new StringBuilder(new String(test));
        answer = tmp.reverse().toString();
        
        return answer;
    }
}