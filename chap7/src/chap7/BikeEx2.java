package chap7;

class Bike2 {
	int wheel;
	
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	
	void drive() {
		System.out.println("����� ��� �����δ�.");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ��� �����.");
	}
}

class AutoBike2 extends Bike2 {
	boolean power;
	
	AutoBike2(int wheel) {
		super(wheel);
	}
	
	void power() {
		power = !power;
		
		if (power) {
			System.out.println("������ �������ϴ�.");
		} else {
			System.out.println("������ �������ϴ�.");
		}
	}
}

public class BikeEx2 {

	public static void main(String[] args) {
		AutoBike2 ab = new AutoBike2(2);
		AutoBike2 ab2;
		Bike2 b;
		ab.power();
		ab.drive();
		System.out.println(ab.wheel + "���� ������ ��������.");
		ab.stop();
		b = (Bike2) ab; // ����ȯ ������ ���� ����
		b.drive();
		System.out.println(b.wheel + "���� ������ ��������.");
		b.stop();
		ab2 = (AutoBike2) b; // ����ȯ ������ ���� �Ұ�
		ab2.power();
		ab2.drive();
		System.out.println(ab2.wheel + "���� ������ ��������.");
		ab2.stop();
	}
}
