package chap04;
import java.util.*;

class FlowEx8 {
	public static void main(String[] args) { 
		char gender;
		String regNo = "";

		System.out.print("(011231-1111222)");

		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();

		// 문자열 중 7번째 문자를 추출하여 gender 변수에 저장
		//  -> 011231-1 중 맨 뒤에 있는 1을 읽음
		gender = regNo.charAt(7); 

		switch(gender) {
			case '1':
			case '3':
				System.out.println("1 또는 3 입니다.");
				break;
			case '2':
			case '4':
				System.out.println("2 또는 4 입니다.");
				break;
			default:
				System.out.println("그 외");
		}
	}
}
