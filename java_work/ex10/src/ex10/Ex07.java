package ex10;

public class Ex07 {
	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = t1;	// 똑같은 주소를 가르키는 것 뿐, 인스턴스가 복사된건 아니다.
		
		System.out.println(t1.channel);
		System.out.println(t1.power);
		
		System.out.println(t2.channel);
		System.out.println(t2.power);
		
		t1.channel++;
		t1.power();
		System.out.println();
		
		System.out.println(t1.channel);
		System.out.println(t1.power);
		
		System.out.println(t2.channel);
		System.out.println(t2.power);
	}
}
