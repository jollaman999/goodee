package chap7;

/*
 * Food, Fruit, Drink, Snack, Apple, Peach, Cock, Cidar, Biscuit, Cookie 클래스 구현하기
 * 모든 식료품(Food)는 가격(price)과 보너스포인트(point)를 가지고 있다.
 * 식료품 객체를 생성하기 위해서는 가격을 입력받고, 1/10을 포인트로 설정한다.
 * 식료품의 종류는 과일(Fruit), 음료(Drink), 과자(Snack) 종류로 나눈다.
 * 과일은 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram) 정보를 가지고 있다.
 * 과일에는 사과(Apple), 복숭아(Peach)가 있고,
 * 음료에는 콜라(Cock), 사이다(Cidar)가 있고,
 * 과자에는 비스킷(Biscuit), 쿠키(Cookie)가 있다.
 * 사과와 복숭아는 가격과 당도를 입력받아 객체를 생성하고,
 * 콜라와 사이다는 가격과 용량을 입력받아 객체를 생성하고,
 * 비스킷과 쿠키는 가격과 무게를 입력받아 객체를 생성한다.
 * 
 * 위의 조건에 맞도록 클래스를 구현하기
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
		this.name = "사과";
	}
}

class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
		this.name = "복숭아";
	}
}

class Cock extends Drink {
	Cock(int price, int ml) {
		super(price, ml);
		this.name = "콜라";
	}
}

class Cidar extends Drink {
	Cidar(int price, int ml) {
		super(price, ml);
		this.name = "사이다";
	}
}

class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
		this.name = "비스킷";
	}
}

class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price, gram);
		this.name = "쿠키";
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
			System.out.println("장바구니 가득참");
			return;
		}
		
		if (money < food.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		System.out.println("물품명 : " + food.name + ", 가격 : " + food.price);
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
			String item = cart[i].name + " " + cart[i].price + "원\n";
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
		
		System.out.println("식료품의 갯수 : " + fruitcnt);
		System.out.println("식료품 목록");
		System.out.println(food_list);
		System.out.println("식료품 구매 금액 : " + food_money);
		System.out.println();
		System.out.println("과일의 갯수 : " + fruitcnt);
		System.out.println("과일 목록");
		System.out.println(fruit_list);
		System.out.println("과일 구매 금액 : " + fruit_money);
		System.out.println();
		System.out.println("음료의 갯수 : " + drinkcnt);
		System.out.println("음료 목록");
		System.out.println(drink_list);
		System.out.println("음료 구매 금액 : " + drink_money);
		System.out.println();
		System.out.println("과자의 갯수 : " + snackcnt);
		System.out.println("과자 목록");
		System.out.println(snack_list);
		System.out.println("과자 구매 금액 : " + snack_money);
		System.out.println();
		System.out.println("남은 금액 : " + money + ", 보유 포인트 : " + point);
	}
}

/*
 * Buyer2 클래스 구현하기
 * 	멤버변수 : money, point, Food[] cart, fruitcnt, drinkcnt, snackcnt, cnt
 * 	메서드 : void buy(Food)
 * 		기능 : 물건 구입시마다 가격만큼 money 차감하고, 포인트 증가
 * 			구입하려는 물건의 값이 큰 경우는 "잔액 부족" 메세지를 출력하기 buy 메서드 종료하기.
 * 			구입시는 구입한 물품명과 가격을 출력. 장바구니에 물건을 넣어주고,
 * 			fruitcnt, drinkcnt, snackcnt, cnt 을 증가시키기
 *  메서드 : void summary()
 *  		기능 : 장바구니에 있는 물건을 조회하여 물건 목록과 총가격, 현재의 보너스 포인트를 출력하기
 *  		과일의 갯수, 과일 목록, 과일 구매 금액
 *  		음료의 갯수, 음료 목록, 음료 구매 금액
 *  		과자의 갯수, 과자 목록, 과자 구매 금액
 *  		남은 금액과 보유한 포인트 출력하기
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
