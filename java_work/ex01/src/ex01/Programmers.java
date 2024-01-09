package ex01;

public class Programmers {
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 2, 1};
		System.out.println(solution(arr));
    }
	
	public static int solution(int[] num_list) {
        String temp = "";
        String temp2 = "";
        for(int i = 0 ; i < num_list.length ; i++) {
        	if(num_list[i] % 2 != 0) {
        		temp += num_list[i] + "";
        	} else {
        		temp2 += num_list[i] + "";
        	}
        };
        return Integer.parseInt(temp) + Integer.parseInt(temp2);
    }
}