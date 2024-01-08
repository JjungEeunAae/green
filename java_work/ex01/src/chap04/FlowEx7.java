package chap04;
import java.util.*;

class FlowEx7 {
	public static void main(String[] args) { 
		int user, com;

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 
		user = Integer.parseInt(tmp);
		
		/* Math.random()
		 * 0<x<1
		 * (Math.random() * 3)          -> 0 ~ 2.9999 사이의 랜덤 숫자가 나옴
		 * (Math.random() * 3) + 1      -> 0 ~ 3.9999 사이의 랜덤 숫자가 나옴
		 * (int)(Math.random() * 3) + 1 -> 1 ~ 3      형변환으로 인해 소수점은 날라간다.
		 */

		com = (int)(Math.random() * 3) + 1;  
		System.out.println(com);
		System.out.println(user-com);

		switch(user-com) {
			case 2: case -1:
				System.out.println("2거나 -1");
				break;
			case 1: case -2:
				System.out.println("1이거나 -2");
				break;
			case 0:
				System.out.println("0");
				break;
			default:
				System.out.println("그 외");
		}
	}
}
