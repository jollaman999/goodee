package chap9.home;

/*
 * OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� �� ���
 */

class Outer {
	class Inner {
		int iv=100;
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println(new Outer().new Inner().iv);
	}
}