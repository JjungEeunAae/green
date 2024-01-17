package 복습;

public class Tri {
	int width;
	int height;
	
	public Tri() {};
	
	// 다른 생성자를 선언하면 기본 생성자가 불가하다.
	public Tri(int width, int height) {
		super();	// 해당 예약어 생략가능함
		this.width = width;
		this.height = height;
	};

	@Override
	public String toString() {
		return "Tri [width=" + width + ", height=" + height + "]";
	};
	
	// 넓이를 구하는 메서드
	public double area() {
		return width * height * 0.5;
	};
}
