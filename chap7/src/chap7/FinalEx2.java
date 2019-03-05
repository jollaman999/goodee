package chap7;

class Card {
	final String type;
	// final int number = 5; // 명시적 초기화
	final int number;
	
	Card() {
		this("Spade", 1);
	}
	
	Card(String type, int number) {
		this.type = type;
		this.number = number;
	}
}

public class FinalEx2 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.type + ", " + c1.number);
		Card c2 = new Card("Clover", 1);
		System.out.println(c2.type + ", " + c2.number);
		// c2.number = 2;
		
		Card c3 = new Card("Heart", 5);
		System.out.println(c3.type + ", " + c3.number);
	}

}
