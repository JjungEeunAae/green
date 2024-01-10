package chap04;
import java.util.*;

class FlowEx25 {
	public static void main(String[] args) { 
		int num = 0; 
		int sum = 0;

		System.out.print("숫자를 입력하세요(예:12345)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 
		num = Integer.parseInt(tmp);     
		
		while(num != 0) {    	// num의 값이 0이 아닌 동안 반복해라.
			sum += num%10;
			System.out.printf("나머지값 덧셈(sum)=%3d num=%d%n", sum, num);

			num /= 10;	// num/10한 값을 num에 대입
						// num은 int형이기 때문에 소수점을 절삭한다.
		}
		
		System.out.println("각 자리수의 합 :"+ sum);
	}
}
