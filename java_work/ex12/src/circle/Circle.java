package circle;

public class Circle {
	//  변수          메서드
	// 반지름, 반지름으로 원넓이 구하기
	private double rad;		// private : 다른 클래스에서 이 변수 참조가 불가하다.
	final double PI = 3.14; // final : 값 변경이 불가한 값을 선언하는 접근제한자
	
	public Circle() {};
	
	public Circle(int rad) {
		this.rad = rad;
	};
	
	public void setRad(double r) {
		if(r < 0 ) {
			this.rad = 0;
			return;
		}
		this.rad = r;
	};
	
	public double getArea() {
		return rad * rad * PI;
	};

}
