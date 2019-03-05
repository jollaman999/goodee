package chap7;

/*
 * �θ�Ŭ������ �ڼ�Ŭ������ ������ ����� �����ϰ� ������
 * ��������� ���������� �ڷ����� ������,
 * ����޼���� ��ü�� ���� �������̵��� �޼��尡 ȣ��ȴ�.
 * 
 * �������̵��� �ν��Ͻ� ����� �ȴ�.
 */

class Parent3 {
	int x = 10;
	
	void method() {
		System.out.println("Parent3 Ŭ������ method()");
	}
}

class Child3 extends Parent3 {
	int x = 20;
	
	void method() {
		System.out.println("Child3 Ŭ������ method()");
	}
}

public class BindingEx1 {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		System.out.println(p.x);
		p.method();
		Child3 c = (Child3) p;
		System.out.println(c.x);
		c.method();
	}

}
