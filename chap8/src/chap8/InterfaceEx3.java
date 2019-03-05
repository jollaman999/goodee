package chap8;

/*
 * �Ű������� �ڷ������� �������̽� �ڷ����� ����ϱ� : �ַ� ����� ����� ������.
 */

interface Repairable{}

class Unit2 {
	int hp;
	final int MAX_HP;
	
	Unit2(int hp) {
		this.hp = hp;
		MAX_HP = hp;
	}
}

class AirUnit extends Unit2 {
	AirUnit(int hp) {
		super(hp);
	}
}

class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
	}

	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
	}

	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit2) {
			Unit2 u = (Unit2) r;
			u.hp = u.MAX_HP;
			System.out.println(r + "���� �Ϸ�");
		}
		// r.hp = r.MAX_HP; Repairable Ÿ���� ����� ����.
	}
	
	public String toString() {
		return "SCV";
	}
}

public class InterfaceEx3 {

	public static void main(String[] args) {
		Tank t = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
		//s.repair(m); Marine ��ü�� Repairable �������̽��� ���������� ����
		// Marine ��ü�� Repairable ��
	}

}
