package ex11;

public class Ex04 {
	public static void main(String[] args) {
		Data d1 = new Data();
		System.out.println(d1.toString());
		System.out.println(d1);
		
		// d2는 d1을 참조한다(같은 주소를 가르킨다)
		Data d2 = d1;
		System.out.println("d2 >> " + d2);
		System.out.println();
		d2.x = 100;
		System.out.println("d1 >> " + d1);
		System.out.println("d2 >> " + d2);
		System.out.println();
		// non-static일 경우 클래스를 인스턴스화 한 후 사용하여야한다.
		// 현재 아래에 나와있는 코드는 static 이다.
		Data d3 = copy(d1);
		System.out.println("d3 >> " + d3);
	}
	
	static Data copy(Data d) {
		Data data = new Data();
		return data;
	}
}

class Data {
	int x = 10;

	@Override
	public String toString() {
		return "Data [x=" + x + "]";
	}
}
