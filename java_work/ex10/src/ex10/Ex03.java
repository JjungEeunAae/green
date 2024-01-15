package ex10;

public class Ex03 {
	public static void main(String[] args) {
		// TV라는 클래스에 어떠한 필드가 있는지, 또는 어떠한 클래스가 있는지 모른다.
		// 이 점은 객체지향언어의 특징 중 하나인 캡슐화이다.
		//	ㄴ 객체의 내부 구조 및 데이터를 캡슐처럼 감싸 외부에서 직접 볼 수 없게 은닉하여 보호하는 것
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.channel = 10;
		System.out.println("tv1 >> " + tv1.channel);
		System.out.println("tv2 >> " + tv2.channel);
		
		tv1.channelUp();
		System.out.println("tv1 >> " + tv1.channel);
		System.out.println("tv2 >> " + tv2.channel);
	}
}
