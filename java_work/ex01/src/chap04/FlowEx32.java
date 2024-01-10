package chap04;
import java.util.*;

class FlowEx32 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("(1) 제곱을 구해라");
			System.out.println("(2) 루트를 구해라");
			System.out.println("(3) 로그10 구해라");
			System.out.print("원하는 메뉴(1~3)를 선택하세요(종료:0)>");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);   

			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택함(종료:0)");
				continue;		
			} else {
				System.out.println("제곱 = " + menu * menu);
				System.out.println("제곱 = " + Math.sqrt(menu));
				System.out.println("제곱 = " + Math.log10(menu));
			}
			
			System.out.println("선택하신 메뉴는 "+ menu +"번입니다.");
		}
	}
}
