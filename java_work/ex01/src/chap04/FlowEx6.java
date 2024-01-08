package chap04;
import java.util.*;

class FlowEx6 {
	public static void main(String[] args) { 
		int month = 0;

		System.out.print("숫자입력>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 
		month = Integer.parseInt(tmp);

		switch(month) {
			case 3: 
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			case 6: case 7: case 8:
				System.out.println("6, 7, 8");
				break;
			case 9: case 10: case 11:
				System.out.println("9, 10, 11");
				break;
			default:
				System.out.println("그 외");
		}
	}
}
