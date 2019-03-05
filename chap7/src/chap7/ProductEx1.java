package chap7;

/*
 * ������ǰ(Product) Ŭ����
 * 	���� : ����, ����Ʈ
 * ������ : ������ �Ű� ������ ���� Ŭ����
 * 		������ �����ϰ�, ����Ʈ�� ������ 1/10�� ���Ѵ�.
 * 
 * Tv Ŭ����
 * 	������ : �Ű����� ���� ������ �Ѱ��� �ִ�.
 * 	�޼��� : toString() �޼���
 * 			"Tv" �����Ѵ�.
 * 
 * Computer Ŭ����
 * 	������ : �Ű����� ���� ������ �Ѱ��� �ִ�.
 * 	�޼��� : toString() �޼���
 * 			"Computer" �����Ѵ�.
 */

class Product {
	int price;
	int point;
	
	Product(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(250);
	}
	
	public String toString() {
		return "Computer";
	}
}

/*
 * �� (Buyer) Ŭ����
 * 	���� : int money, int point, Product[2] cart
 * 	�޼��� : void buy(Product)
 * 		��ǰ�� �����Ҷ� ���� ���� ���ݿ��� ���ݸ�ŭ �����ǰ�, ����Ʈ�� ���δ�.
 * 		�ش� ��ǰ�� cart�� ������.
 */

class Buyer {
	int money;
	int point;
	Product[] cart = new Product[2];
	int count;
	int sum;
	
	Buyer(int money) {
		this.money = money;
	}
	
	void buy (Product p) {
		if (count > cart.length) {
			System.out.println("īƮ�� �� á���ϴ�!");
			return;
		}
		
		if (money < p.price) {
			System.out.println("���� �����մϴ�!");
			return;
		}
		
		money -= p.price;
		point += p.point;
		sum += money;
		cart[count++] = p;
		
		System.out.println(p + "����!");
	}
	
	void summary() {
		System.out.println("�� ���� �ݾ� : " + sum);
		System.out.print("���� ��� : ");
		for (int i = 0; i < cart.length; i++) {
			System.out.print(cart[i]);
			if (i != cart.length - 1) {
				System.out.print(", ");
			}
		}
	}
}

public class ProductEx1 {

	public static void main(String[] args) {
		Buyer b = new Buyer(500);
		Tv t = new Tv();
		Computer c = new Computer();
		
		b.buy(t);
		b.buy(c);
		System.out.println("���� �� �ܾ� : " + b.money);
		System.out.println("���� �� ����Ʈ : " + b.point);
		b.summary(); // �� ���űݾ� : 450
					// ���Ÿ�� : Tv, Computer
	}

}
