package chap7;

class Parent {
	int x = 10;
	public Parent() {
		super();
	}
}

class Child extends Parent {
	int x = 20;
	void method() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(super.toString());
	}
}

public class SuperEx1 extends Object {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		// super 참조변수 아용불가. main 메서드는 static 멤버임.
		// System.out.println(super.toString());
	}

}
