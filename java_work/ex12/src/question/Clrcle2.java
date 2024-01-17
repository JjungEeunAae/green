package question;

public class Clrcle2 {
	Point p;
	int rad;
	
	public Clrcle2() {};
	
	public Clrcle2(Point p, int rad) {
		this.p = p;
		this.rad = rad;
	};
	
	public void showClrcleInfo() {
		p.showPointInfo();
		System.out.println("rad = " + rad);
	};

	public static void main(String[] args) {
		Point p = new Point(2,2);
		Clrcle2 c = new Clrcle2(p,4);	// 좌표 2,2 반지름 4인 원의 생성
		c.showClrcleInfo();				// 원의 정보 출력
	}
}
