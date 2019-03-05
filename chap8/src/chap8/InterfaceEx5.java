package chap8;

interface MyInterface1 {
	default void method1() {
		System.out.println("MyInterface1 �� default �޼��� : method1()");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface1�� default �޼��� : staticMethod()");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("MyInterface2�� default �޼��� : method1()");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface2�� default �޼��� : staticMethod()");
	}
}

class ImpClass implements MyInterface1, MyInterface2 { // ���� ����
	
	@Override
	public void method1() {
		System.out.println("ImpClass Ŭ������ method1() �޼���");
		MyInterface1.super.method1();
		MyInterface2.super.method1();
	}
}

public class InterfaceEx5 {

	public static void main(String[] args) {
		ImpClass c = new ImpClass();
		c.method1();
	}

}
