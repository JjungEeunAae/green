package ex10;

public class Ex02 {
	public static void main(String[] args) {
		TV tv = new TV();	// 인스턴스 생성
		
		tv.power();
		System.out.println(tv.power);
		
		tv.channel = 0;
		tv.channelDown();
		System.out.println(tv.channel);
	};
}
