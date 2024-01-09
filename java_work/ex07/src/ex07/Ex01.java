package ex07;

public class Ex01 {
	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		answer = my_string.substring(0,s) + overwrite_string;
		
		if(answer.length() < my_string.length()) {
			answer += my_string.substring(answer.length());
		}
		
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("He11owor1d", "lloWorl", 2));
		System.out.println(solution("Program29b8UYP", "merS123", 7));
	}
}