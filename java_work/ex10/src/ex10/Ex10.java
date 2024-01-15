package ex10;

public class Ex10 {
	public int solution(String number) {
		int answer = 0;
		char[] arr = number.toCharArray();
		
		for(char i : arr) { 
			answer += i - 48;
		}
		
		return answer;
	}

	public Ex10() {
		String num = "325236234234";
		
		System.out.println(solution(num));
	};
	
	public static void main(String[] args) {
		new Ex10();	// heap 영역에 넣어진다(개발자가 쓰는 공간)
	}
}
