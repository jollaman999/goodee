package chap6;

/*
 * Ŭ���� ����, �ν��Ͻ� ���� ����
 */
class Card {
	String type; // �ν��Ͻ� ����
	int number; // �ν��Ͻ� ����
	static int width = 150; // Ŭ���� ����
	static int height = 250; // Ŭ���� ����
	// ��ü�� ���ڿ�ȭ�ϴ� �޼���, �������� �̸��� ����ϸ� �ڵ� ȣ��Ǵ� �޼���
	public String toString() {
		return type + ":" + number + "(" + width + ", " + height + ")";
	}
}

public class CardEx1 {

	public static void main(String[] args) {
		System.out.println("Card�� ũ�� : " + Card.width + ", " + Card.height);
		// System.out.println(Card.typr + ":" + Card.number); // ���� �߻�, �ν��Ͻ� ������ ��üȭ �Ǿ�� �Ѵ�
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
