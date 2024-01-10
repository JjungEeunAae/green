package chap04;
import java.util.*;

class FlowEx34 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요(종료:0)>");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);   
			
			// 메뉴가 0이면 break를 통해 종료.
			if(menu==0) {  
				System.out.println("프로그램을 종료합니다.");
				break;
			// 메뉴가 1~3이 아닐 때 
			} else if (!(1<= menu && menu <= 3)) {
				System.out.println("메뉴 선택 오류(종료:0)");
				continue;
			}

			for(;;) {	// 무한루프
		    System.out.print("계산할 숫자 입력(종료:0, 전체종료:99)>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)  {	// 프로그램 종료 후 메뉴로 이동 (해당 for문 종료)
					System.out.println("메뉴로 돌아갑니다.");
					break;
				};
				
				if(num==99) { 	// 전체종료 (자식 반복문에 붙은 라벨을 통해 반복문 아예 종료)
					System.out.println("프로그램을 종료합니다.");
					break outer;
				};
				
				// 위의 조건이 모두 false면 이쪽으로 내려옴
				switch(menu) {		// 조건문 : 메뉴 번호를 통해 연산을 진행한다.
					case 1: 
						System.out.println("result="+ num*num);			// 제곱
						break;
					case 2: 
						System.out.println("result="+ Math.sqrt(num)); // 루트
						break;
					case 3: 
						System.out.println("result="+ Math.log(num));  // 로그
						break;
				} 
			} // for(;;)
		} // while의 끝
	} // main의 끝
}
