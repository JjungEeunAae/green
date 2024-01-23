package codeReview;

import java.util.Scanner;
/* <가위바위보 게임>
 *  → 게임은 3판만 진행.
 * 	→ 3판 중 이긴 횟수를 출력
 */
public class Test {
	public static void main(String[] args) {		
		String[] game = {"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------------");
		System.out.println(">>        가위바위보 게임        <<");
		System.out.println("-------------종료:0--------------");
		int count = 0;
		for(int i = 0 ; i < 3 ; i++) {
			int random = (int)(Math.random() * 3);
			String bot = game[random];
			
			System.out.println();
			System.out.println((i+1) + "판째! 시~작!!");
			System.out.println("가위~바위~보!");
			String user = sc.next();

			switch (user) {
				case "가위":
					if(bot == "가위") {
						System.out.println("비겼습니다¯\\(°_o)/¯");
					} else if(bot == "바위") {
						System.out.println("졌습니다(っ °Д °;)っ");
					} else if(bot == "보") {
						System.out.println("이겼습니다q(≧▽≦q)");
						count++;
					}
					break;
				case "바위":
					if(bot == "바위") {
						System.out.println("비겼습니다¯\\(°_o)/¯");
					} else if(bot == "보") {
						System.out.println("졌습니다(っ °Д °;)っ");
					} else if(bot == "가위") {
						System.out.println("이겼습니다q(≧▽≦q)");
						count++;
					}
					break;
				case "보":
					if(bot == "보") {
						System.out.println("비겼습니다¯\\(°_o)/¯");
					} else if(bot == "가위") {
						System.out.println("졌습니다(っ °Д °;)っ");
					} else if(bot == "바위") {
						System.out.println("이겼습니다q(≧▽≦q)");
						count++;
					}
					break;
				case "0":
					System.out.println("종료합니다.");
					break;
				default:
					System.out.println("가위,바위,보 중 하나만 내주세요.");
			}
		}
		
		if(count == 0) {
			System.out.println();
			System.out.println("아쉽게도 한번도 이기지 못했습니다 :(");
		} else {
			System.out.println();
			System.out.println("3판 중 " + count + "번 이겼습니다! :D");
		}
			
	}
}
