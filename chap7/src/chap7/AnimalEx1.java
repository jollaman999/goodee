package chap7;

/*
 * 1. Animal 클래스 => 추상 클래스
 *    멤버 변수 : 동물의 종류, 다리 수
 *    생성자 : 멤버변수를 입력받아서 생성
 *    멤버메서드 : void eat(); => 추상 메서드
 * 			String sound(); => 추상 메서드
 * 2. Dog 클래스
 *    멤버메서드 : void eat(); => 주인이 주는대로 먹는다
 *             String sound(); => 멍멍
 * 2. Lion 클래스
 *    멤버메서드 : void eat(); => 초식동물을 사냥해서 먹는다
 *             String sound(); => 어흥
 */

abstract class Animal {
	String type;
	int legs;
	
	Animal(String type, int legs) {
		this.type = type;
		this.legs = legs;
	}
	
	abstract void eat();
	abstract String sound();
}

class Dog extends Animal {
	Dog() {
		super("강아지", 4);
	}
	
	void eat() {
		System.out.println("주인이 주는대로 먹는다");
	}
	
	String sound() {
		return "멍멍";
	}
}

class Lion extends Animal {
	Lion() {
		super("사자", 4);
	}
	
	void eat() {
		System.out.println("초식동물을 사냥해서 먹는다");
	}
	
	String sound() {
		return "어흥";
	}
}

/*
 * 동물을 배열에 이용하여 저장하고, 동물별로 eat() 메서드와 sound() 메서드를 호출
 */

public class AnimalEx1 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Lion();
		for (Animal a : animals) {
			System.out.println(a.type + "===>");
			System.out.println(a.sound());
			a.eat();
		}
	}

}
