package chap8;

// import chap8.packtest.Pack1; // Pack1 Ŭ������ ��Ű���� ����
import chap8.packtest.*; // chap8.packtest ��Ű���� ��� Ŭ������ ��Ű������ ����

class Test extends Pack1 {
	
	void testmethod() {
		// method();
		method2(); // protected �����������̹Ƿ� ���� ���
	}
}

public class PackEx1 {

	public static void main(String[] args) {
		System.out.println("��Ű�� ����");
		Pack1 p = new Pack1();
		// p.method(); // default �̱� ������ ���� �ȵ�
		// p.method2(); // protected �̱� ������ ���� �ȵ�
		Test t = new Test();
		t.testmethod();
		Test2 t2 = new Test2();
		t2.testmethod();
	}

	Test t = new Test();
}
