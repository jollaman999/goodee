package chap7;

abstract class Abs1 {
	int a = 10;
	abstract int getA();
}

abstract class Abs2 extends Abs1 {
	int b = 20;
	int getA() { return 0; }
	abstract int getB();
}

class Normal extends Abs2 {
	int c = 30;
	
//	@Override
//	int getA() {
//		return a;
//	}

	@Override
	int getB() {
		return b;
	}
	
	int getC() {
		return c;
	}
}

public class AbstractEx1 {

	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a + "=>" + n.getA());
		System.out.println(n.b + "=>" + n.getB());
		System.out.println(n.c + "=>" + n.getC());
		
		Abs2 a2 = n;
		System.out.println(a2.a + "=>" + a2.getA());
		System.out.println(a2.b + "=>" + a2.getB());
		// c, getC ����� Normal Ŭ������ �����
		//System.out.println(a2.c + "=>" + a2.getC());
		
		Abs1 a1 = a2;
		System.out.println(a1.a + "=>" + a1.getA());
		// b, getB ����� Abs2 Ŭ������ Normal Ŭ������ �����
		// System.out.println(a1.b + "=>" + a1.getB());
		// System.out.println(a1.c + "=>" + a1.getC());
		
		Object o = a1;
		// Object Ÿ���� ���������δ� a, b, c, getA, getB, getC ����� ������ �� ����
		// System.out.println(o.a + "=>" + o.getA());
		// System.out.println(o.b + "=>" + o.getB());
		// System.out.println(o.c + "=>" + o.getC());
	}

}
