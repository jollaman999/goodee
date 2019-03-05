package chap7;

class Parent2 {
	int x;
	Parent2(int x) {
		this.x = x;
	}
}

class Child2 extends Parent2 {
	int x = 20;
	public Child2() {
		super(10);
	}
	void method() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}

public class SuperEx2 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
		System.out.println(c.x);
	}

}
