package mysqltest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		DB db = new DB();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("       마! 번호 입력해봐라!       ");
			System.out.println("1.할일입력 | 2.할일목록 | 3.할일수정");
			System.out.println("4.할일삭제 | 0.종료");
			String input = sc.nextLine();
			
			if(input.equals("1")) {
				String a = sc.nextLine();
				String b = sc.nextLine();
				db.insert(a,b.toUpperCase());
			} else if(input.equals("2")) {
				db.select();
			} else if(input.equals("3")) {
				//수정
				System.out.println("수정할 번호 입력");
				int idx = sc.nextInt();
				System.out.println("할 일 내용 수정");
				String a = sc.next();
				System.out.println("상태 수정");
				String b = sc.next();
				db.update(a,b,idx);
				break;
			} else if(input.equals("4")) {
				// 삭제
				System.out.println("삭제할 번호 입력");
				int a = sc.nextInt();
				db.delete(a);
				break;
			} else if(input.equals("0")) {
				// 종료
				db.close();
				break;
			} else {
				System.err.println("메뉴에 없는 번호 적었다!");
			};
		}
	}
	
}