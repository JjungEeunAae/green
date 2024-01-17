package test;

public class Person {
	String name;
	String phone;
	
	public Person() {
		doAction();
	};
	
	public void doAction() {
		System.out.println(name + "이 움직입니다.");
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
