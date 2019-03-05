package chap8;

/*
 * jdk 8.0 ���� �߰� : �������̽��� ����� �����θ� ���� �޼��带 ������
 * 		default �޼���
 * 		static �޼���
 */

class Parent {
	
}

interface MyInterface {
	default void method1() { 
		System.out.println("MyInterface �������̽��� method1() �޼���");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface �������̽��� staticMethod() �޼���");
	}
}

class Child extends Parent implements MyInterface {
	@Override
	public void method1() { // default �޼��� �������̵�
		System.out.println("Child �������̽��� method1() �޼���");
	}
}

public class InterfaceEx4 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		// MyInterface.method1(); // �ν��Ͻ� �޼���, ��üȭ �ʿ�
		MyInterface.staticMethod(); // Ŭ���� �޼���
		Parent p = c; // Parent Ŭ������ MyInterface �������̽��� ���� Ŭ������ �ƴ�
		// p.method1();
	}

}
