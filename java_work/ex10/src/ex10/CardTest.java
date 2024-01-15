package ex10;

class Card {
	String kind;
	int num;
	// static 변수는 대문자로 선언하는 것이 대부분이다.
	static int WIDTH;
	static int HEIGHT;
}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.WHDTH >> " + Card.WIDTH);
		System.out.println("Card.HEIGHT >> " + Card.HEIGHT);
		
		Card c1 = new Card();
		c1.kind = "소나무";
		c1.num = 10;
		c1.HEIGHT = 200;
		c1.WIDTH = 500;
		
		Card c2 = new Card();
		c2.kind = "세잎클로버";
		c2.num = 5;
		
		System.out.println("c1.kind = " + c1.kind + ", c1.num = " + c1.num);
		System.out.println("c2.kind = " + c2.kind + ", c2.num = " + c2.num);
		
		System.out.println("Card.WHDTH >> " + Card.WIDTH);
		System.out.println("Card.HEIGHT >> " + Card.HEIGHT);
	}
}
