package mysqltest;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		DB db = new DB();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("  마! 번호 입력해봐라! ");
			System.out.println("1.할일입력 | 2.할일목록 | 3.종료");
			String input = sc.nextLine();
			
			if(input.equals("1")) {
				db.insert();
			} else if(input.equals("2")) {
				db.select();
			} else if(input.equals("3")) {
				db.close();
				break;
			} else {
				System.err.println("메뉴에 없는 번호 적었다!");
			};
		}
	}
	
}