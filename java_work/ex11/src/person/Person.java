package person;

public class Person {
	String name;
	String phone;
	String gender;
	String remark;
	int age;
	
	public Person() {};
	
	// 다른 생성자를 선언하게 되면 기본 생성자 생략 불가
	public Person(String name, String phone, String gender, String remark, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.remark = remark;
		this.age = age;
	};

	// 필드를 설정하는 메서드
	public void setPerson(String name, String phone, String gender, String remark, int age) {
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.remark = remark;
		this.age = age;
	};

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", gender=" + gender + ", remark=" + remark + ", age="
				+ age + "]";
	};
	
	public void initValue(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
