package ex01;

public class Programmers {
	public static void main(String[] args) {
		int[] arr = {1, 2, 7, 10, 11};
//		System.out.println(solution("aaaaa","bbbbb"));
        
	}
	public static String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0 ; i < str1.length() ; i++) {
        	char a = str1.charAt(i);
        	char b = str2.charAt(i);
        	
        	answer += Character.toString(a) + Character.toString(b);
        }
        
        
        return answer;
    }
}