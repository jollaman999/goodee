package chap6;

class Math2 {
	long a, b;
	long add1() {
		return a + b;
	}
	static long add2(int a, int b) {
		return a + b;
	}
}

public class MathEx2 {
	public static void main(String args[]) {
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(Math2.add2(10, 20));
	}
}
