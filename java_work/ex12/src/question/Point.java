package question;

public class Point {
	int xPos;
	int yPos;
	
	public Point(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	};
	
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	};
}
