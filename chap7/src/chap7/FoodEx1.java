package chap7;

/*
 * Food, Fruit, Drink, Snack, Apple, Peach, Cock, Cidar, Biscuit, Cookie Ŭ���� �����ϱ�
 * ��� �ķ�ǰ(Food)�� ����(price)�� ���ʽ�����Ʈ(point)�� ������ �ִ�.
 * �ķ�ǰ ��ü�� �����ϱ� ���ؼ��� ������ �Է¹ް�, 1/10�� ����Ʈ�� �����Ѵ�.
 * �ķ�ǰ�� ������ ����(Fruit), ����(Drink), ����(Snack) ������ ������.
 * ������ �絵(brix)��, ����� �뷮(ml), ���ڴ� ����(gram) ������ ������ �ִ�.
 * ���Ͽ��� ���(Apple), ������(Peach)�� �ְ�,
 * ���ῡ�� �ݶ�(Cock), ���̴�(Cidar)�� �ְ�,
 * ���ڿ��� ��Ŷ(Biscuit), ��Ű(Cookie)�� �ִ�.
 * ����� �����ƴ� ���ݰ� �絵�� �Է¹޾� ��ü�� �����ϰ�,
 * �ݶ�� ���̴ٴ� ���ݰ� �뷮�� �Է¹޾� ��ü�� �����ϰ�,
 * ��Ŷ�� ��Ű�� ���ݰ� ���Ը� �Է¹޾� ��ü�� �����Ѵ�.
 * 
 * ���� ���ǿ� �µ��� Ŭ������ �����ϱ�
 */

class Food {
	int price;
	int point;
	String name;
	
	Food(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

class Fruit extends Food {
	double brix;
	
	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
}

class Drink extends Food {
	int ml;
	
	Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
}

class Snack extends Food {
	int gram;
	
	Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
}

class Apple extends Fruit {
	Apple(int price, double brix) {
		super(price, brix);
		this.name = "���";
	}
}

class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
		this.name = "������";
	}
}

class Cock extends Drink {
	Cock(int price, int ml) {
		super(price, ml);
		this.name = "�ݶ�";
	}
}

class Cidar extends Drink {
	Cidar(int price, int ml) {
		super(price, ml);
		this.name = "���̴�";
	}
}

class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
		this.name = "��Ŷ";
	}
}

class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price, gram);
		this.name = "��Ű";
	}
}

class Buyer2 {
	int money;
	int point;
	Food[] cart;
	int fruitcnt;
	int drinkcnt;
	int snackcnt;
	int cnt;
	
	Buyer2() {
		money = 10000;
		cart = new Food[5];
		for (int i = 0; i < cart.length; i++) {
			cart[i] = new Food(0);
		}
	}
	
	void buy(Food food) {
		if (cnt > cart.length) {
			System.out.println("��ٱ��� ������");
			return;
		}
		
		if (money < food.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		
		System.out.println("��ǰ�� : " + food.name + ", ���� : " + food.price);
		this.money -= food.price;
		this.point += food.point;
		cart[cnt++] = food;
		
		if (food instanceof Fruit) {
			fruitcnt++;
		} else if (food instanceof Drink) {
			drinkcnt++;
		} else if (food instanceof Snack) {
			snackcnt++;
		}
	}
	
	void summary() {
		String food_list = "";
		String fruit_list = "";
		String drink_list = "";
		String snack_list = "";
		int food_money = 0;
		int fruit_money = 0;
		int drink_money = 0;
		int snack_money = 0;
		
		for (int i = 0; i < cart.length; i++) {
			String item = cart[i].name + " " + cart[i].price + "��\n";
			int price = cart[i].price;
			food_list += item;
			
			if (cart[i] instanceof Fruit) {
				fruit_list += item;
				fruit_money += price;
			} else if (cart[i] instanceof Drink) {
				drink_list += item;
				drink_money += price;
			} else if (cart[i] instanceof Snack) {
				snack_list += item;
				snack_money += price;
			}
		}
		food_money = fruit_money + drink_money + snack_money;
		
		System.out.println("�ķ�ǰ�� ���� : " + fruitcnt);
		System.out.println("�ķ�ǰ ���");
		System.out.println(food_list);
		System.out.println("�ķ�ǰ ���� �ݾ� : " + food_money);
		System.out.println();
		System.out.println("������ ���� : " + fruitcnt);
		System.out.println("���� ���");
		System.out.println(fruit_list);
		System.out.println("���� ���� �ݾ� : " + fruit_money);
		System.out.println();
		System.out.println("������ ���� : " + drinkcnt);
		System.out.println("���� ���");
		System.out.println(drink_list);
		System.out.println("���� ���� �ݾ� : " + drink_money);
		System.out.println();
		System.out.println("������ ���� : " + snackcnt);
		System.out.println("���� ���");
		System.out.println(snack_list);
		System.out.println("���� ���� �ݾ� : " + snack_money);
		System.out.println();
		System.out.println("���� �ݾ� : " + money + ", ���� ����Ʈ : " + point);
	}
}

/*
 * Buyer2 Ŭ���� �����ϱ�
 * 	������� : money, point, Food[] cart, fruitcnt, drinkcnt, snackcnt, cnt
 * 	�޼��� : void buy(Food)
 * 		��� : ���� ���Խø��� ���ݸ�ŭ money �����ϰ�, ����Ʈ ����
 * 			�����Ϸ��� ������ ���� ū ���� "�ܾ� ����" �޼����� ����ϱ� buy �޼��� �����ϱ�.
 * 			���Խô� ������ ��ǰ��� ������ ���. ��ٱ��Ͽ� ������ �־��ְ�,
 * 			fruitcnt, drinkcnt, snackcnt, cnt �� ������Ű��
 *  �޼��� : void summary()
 *  		��� : ��ٱ��Ͽ� �ִ� ������ ��ȸ�Ͽ� ���� ��ϰ� �Ѱ���, ������ ���ʽ� ����Ʈ�� ����ϱ�
 *  		������ ����, ���� ���, ���� ���� �ݾ�
 *  		������ ����, ���� ���, ���� ���� �ݾ�
 *  		������ ����, ���� ���, ���� ���� �ݾ�
 *  		���� �ݾװ� ������ ����Ʈ ����ϱ�
 */

public class FoodEx1 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Apple a = new Apple(1000, 10.5);
		Peach p = new Peach(2000, 15.5);
		b.buy(a);
		b.buy(p);
		b.summary();
	}

}
