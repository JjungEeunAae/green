package person;

public class Ex10 {
	public static void main(String[] args) {
		hiEveryOne("홍길동", 12, "남성");
		
		Person p = new Person("훈",null,"남성",null,5);
//		p.initValue("훈",5,"남성");
//		p.name = "훈";
//		p.age = 5;
//		p.gender = "남성";
		hiEveryOne(p);
	}

	public static void hiEveryOne(Person p) {
		System.out.println("하이 나는 " + p.name + "이야! 나이는 " + p.age + "살이고, 성별은 " + p.gender + "이야!");
	}
	
	public static void hiEveryOne(String name, int age, String gender) {
		System.out.println("하이 나는 " + name + "이야! 나이는 " + age + "살이고, 성별은 " + gender + "이야!");
	}
}
