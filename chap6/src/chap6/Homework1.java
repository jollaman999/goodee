package chap6;

class SutdaCard {
	int number;
	boolean isKwang;
	
	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	SutdaCard() {
		this.number = 1;
		this.isKwang = true;
	}
	String info() {
		String kwang = "K";
		if (!isKwang) {
			kwang = "";
		}
		return number + kwang;
	}
}

public class Homework1 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());//3
		System.out.println(card2.info());//1K
	}

}
