package chap8;

interface Moveable {
	int MAX = 100;
	public abstract void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

interface Fightable extends Moveable, Attackable {} // 다중상속

class Unit {
	int currentHp, x, y;
}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.println(x + ", " + y + "좌표로 이동");
	}

	@Override
	public void attack(Unit u) {
		System.out.println(u + "공격");
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
			System.out.println("f 가 참조하는 객체는 Fighter");
		}
		if (f instanceof Unit) {
			System.out.println("f 가 참조하는 객체는 Unit");
			Unit u = (Unit) f;
			System.out.println("u 참조변수로 참조 가능한 멤버는 Object 멤버를 제외하면 3개다");
			System.out.println(u.currentHp + ", " + u.x + ", " + u.y);
		}
		if (f instanceof Moveable) {
			System.out.println("f 가 참조하는 객체는 Moveable");
			Moveable m = (Moveable)f;
			System.out.println("m 참조변수로 참조 가능한 멤버는 Object 멤버를 제외하면 2개다");
			System.out.println(m.MAX);
			m.move(40, 50);
		}
		if (f instanceof Fightable) {
			System.out.println("f 가 참조하는 객체는 Fightable");
			Fightable fa2 = (Fightable)f;
			System.out.println("fa2 참조변수로 참조 가능한 멤버는 Object 멤버를 제외하면 3개다.");
			System.out.println(fa2.MAX);
			fa2.attack(f);
			fa2.move(30, 40);
		}
		if (f instanceof Attackable) {
			System.out.println("f 가 참조하는 객체는 Attackable");
			Attackable a = (Attackable)f;
			System.out.println("a 참조변수로 참조가능한 멤버는 Object 멤버를 제외하면 1개다");
			a.attack(f);
		}
		if (f instanceof Object) {
			System.out.println("f 가 참조하는 객체는 Object");
			Object o = (Object)f;
			System.out.println("o 참조변수로 참조 가능한 멤버는 Object 멤버를 제외하면 0개다");
		}
	}

}
