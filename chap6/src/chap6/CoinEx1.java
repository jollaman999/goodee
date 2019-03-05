package chap6;

class Coin {
	int side;
	void flip() {
		/*
		 * Math.random() * 2 ·Î ÇÏ¿©µµ µÊ
		 * 
		 * 0 <= Math.random() < 1.0
		 * 0 <= Math.random() * 2 < 2.0
		 * 0 <= (int) (Math.random() * 2) < 2
		 */
		side = (int) (Math.random() * 10) % 2;
	}
}

public class CoinEx1 {

	public static void main(String[] args) {
		Coin coin = new Coin();
		coin.flip();
		switch (coin.side) {
		case 0:
			System.out.println("¾Õ¸é");
			break;
		case 1:
			System.out.println("µÞ¸é");
			break;
		default:
			break;
		}
	}

}
