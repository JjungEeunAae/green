package chap04;

import java.util.*;

class FlowEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 입력해라 마!");
		int input = Integer.parseInt(scanner.nextLine());

		if (input == 0) {
			System.out.println("0을 입력했네요.");
		} else {
			System.out.println("0말고 다른 것을 입력했네요. " + input);
		};

	}
}
