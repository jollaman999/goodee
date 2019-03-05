package chap7;

class Bike {
	int wheel;

	Bike (int wheel) {
		this.wheel = wheel;
	}
	
	String drive() {
		return "����� ��´�.";
	}
	
	String stop() {
		return "�극��ũ�� ��´�.";
	}
}

class AutoBike extends Bike {
	AutoBike (int wheel) {
		super(wheel);
	}
	
	@Override	// ������̼�, �������̵� �� �޼���� Ȯ��. �������̵� ������ ������ �޼�����.
	String drive() {
		return "���۹�ư�� ������.";
	}
	
	@Override
	String stop() {
		return "�����ư�� ������.";
	}
}

public class BikeEx1 {

	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.wheel + "���� ������ ���� ���ϴ�.");
		System.out.println(ab.stop());
		Bike b = new Bike(4);
		System.out.println(b.drive());
		System.out.println(b.wheel + "���� ������ ���� ���ϴ�.");
		System.out.println(b.stop());
	}

}
