package chap04;
import java.util.*;

class FlowEx27 {
	public static void main(String[] args) { 
		int num;
		int sum = 0;
		boolean flag = true;

		System.out.println("합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)");

		while(flag) {    // flag의 값이 true이므로 조건식은 참이 된다.
			System.out.print(">>");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);  

			if(num!=0) {  
				sum += num;
			} else {
				flag = false;
			}
		}

		System.out.println("합계 : "+ sum);
	}
}
