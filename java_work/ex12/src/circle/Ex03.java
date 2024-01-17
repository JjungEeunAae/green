package circle;

public class Ex03 {
	public static void main(String[] args) {
		Circle c = new Circle();
		
//		c.rad = 10;
//		System.out.println(c.rad);
		c.setRad(10);
		System.out.println(c.getArea());

		Circle c2 = new Circle(20);
		System.out.println(c2.getArea());
		
		c.setRad(-3.3);
		System.out.println(c.getArea());
	}
}
