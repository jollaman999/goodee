package chap8;

interface Moveable {
	int MAX = 100;
	public abstract void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

interface Fightable extends Moveable, Attackable {} // ���߻��

class Unit {
	int currentHp, x, y;
}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.println(x + ", " + y + "��ǥ�� �̵�");
	}

	@Override
	public void attack(Unit u) {
		System.out.println(u + "����");
	}
	
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		System.out.println(f.MAX);
		
		f.move(12, 15);
		f.attack(f);
		
		Fightable fa = f;
		System.out.println(fa.MAX);
		fa.attack(f);
		fa.move(20, 30);
		//System.out.println(fa.currentHp);
		
		if (f instanceof Fighter) {
			System.out.println("f �� �����ϴ� ��ü�� Fighter");
		}
		if (f instanceof Unit) {
			System.out.println("f �� �����ϴ� ��ü�� Unit");
			Unit u = (Unit) f;
			System.out.println("u ���������� ���� ������ ����� Object ����� �����ϸ� 3����");
			System.out.println(u.currentHp + ", " + u.x + ", " + u.y);
		}
		if (f instanceof Moveable) {
			System.out.println("f �� �����ϴ� ��ü�� Moveable");
			Moveable m = (Moveable)f;
			System.out.println("m ���������� ���� ������ ����� Object ����� �����ϸ� 2����");
			System.out.println(m.MAX);
			m.move(40, 50);
		}
		if (f instanceof Fightable) {
			System.out.println("f �� �����ϴ� ��ü�� Fightable");
			Fightable fa2 = (Fightable)f;
			System.out.println("fa2 ���������� ���� ������ ����� Object ����� �����ϸ� 3����.");
			System.out.println(fa2.MAX);
			fa2.attack(f);
			fa2.move(30, 40);
		}
		if (f instanceof Attackable) {
			System.out.println("f �� �����ϴ� ��ü�� Attackable");
			Attackable a = (Attackable)f;
			System.out.println("a ���������� ���������� ����� Object ����� �����ϸ� 1����");
			a.attack(f);
		}
		if (f instanceof Object) {
			System.out.println("f �� �����ϴ� ��ü�� Object");
			Object o = (Object)f;
			System.out.println("o ���������� ���� ������ ����� Object ����� �����ϸ� 0����");
		}
	}

}
