package ex11;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hiEveryone(12, 120.5);
		hiEveryone(13, 120);
		hiEveryone(14, 110.5);
		hiEveryone(15, 150.5);
		
		System.out.println("프로그램 종료");
	}

	public static void hiEveryone(int age, double height) {
		System.out.println("안녕하세요");
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 키는 " + height + "cm 입니다.");
	}
}
