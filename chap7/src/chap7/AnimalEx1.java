package chap7;

/*
 * 1. Animal Ŭ���� => �߻� Ŭ����
 *    ��� ���� : ������ ����, �ٸ� ��
 *    ������ : ��������� �Է¹޾Ƽ� ����
 *    ����޼��� : void eat(); => �߻� �޼���
 * 			String sound(); => �߻� �޼���
 * 2. Dog Ŭ����
 *    ����޼��� : void eat(); => ������ �ִ´�� �Դ´�
 *             String sound(); => �۸�
 * 2. Lion Ŭ����
 *    ����޼��� : void eat(); => �ʽĵ����� ����ؼ� �Դ´�
 *             String sound(); => ����
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
		super("������", 4);
	}
	
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�");
	}
	
	String sound() {
		return "�۸�";
	}
}

class Lion extends Animal {
	Lion() {
		super("����", 4);
	}
	
	void eat() {
		System.out.println("�ʽĵ����� ����ؼ� �Դ´�");
	}
	
	String sound() {
		return "����";
	}
}

/*
 * ������ �迭�� �̿��Ͽ� �����ϰ�, �������� eat() �޼���� sound() �޼��带 ȣ��
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
