package ex07;

public class Ex05 {
	public static String solution(String my_string, int k) {
		String answer = "";
		
		for(int i = 0 ; i < k ; i++) {
			answer += my_string;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("string",10));
		System.out.println(solution("my_string",5));
	}
}
