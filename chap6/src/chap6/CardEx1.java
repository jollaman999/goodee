package chap6;

/*
 * 클래스 변수, 인스턴스 변수 예제
 */
class Card {
	String type; // 인스턴스 변수
	int number; // 인스턴스 변수
	static int width = 150; // 클래스 변수
	static int height = 250; // 클래스 변수
	// 객체의 문자열화하는 메서드, 참조변수 이름을 출력하면 자동 호출되는 메서드
	public String toString() {
		return type + ":" + number + "(" + width + ", " + height + ")";
	}
}

public class CardEx1 {

	public static void main(String[] args) {
		System.out.println("Card의 크기 : " + Card.width + ", " + Card.height);
		// System.out.println(Card.typr + ":" + Card.number); // 오류 발생, 인스턴스 변수는 객체화 되어야 한다
		Card c1 = new Card();
		c1.type = "Spade";
		c1.number = 1;
		Card c2 = new Card();
		c2.type = "Clover";
		c2.number = 10;
		System.out.println(c1.toString());
		System.out.println(c2);
		// c1.width = 50;
		// c1.height = 80;
		Card.width = 50;
		Card.height = 80;
		System.out.println(c1);
		System.out.println(c2);
		
		int cc = Card.width;
		System.out.println(cc + ", " + Card.height);
	}

}
