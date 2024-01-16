package person;

public class Ex01 {
	public static void main(String[] args) {
		Person[] p = new Person[10];
		
		System.out.println(p[0]);		// null
		
		p[0] = new Person();
		// toString 함수가 없으면 그냥 주소값만 출력한다.
		// 자바 규칙임
		System.out.println(p[0]);		// Person [name=null, phone=null, gender=null, remark=null]
		
		p[0].setPerson("유리", "010-1152-4856", "여성", "없음", 5);
		System.out.println(p[0]);		// Person [name=유리, phone=010-1152-4856, gender=여성, remark=없음]
		
	}
}
