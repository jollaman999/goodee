package chap8.packtest;

public class Pack1 {
	private int num;
	
	void method() {
		num = 100;
		System.out.println("chap8.packtest.Pack1 Ŭ������ method() �޼��� ��");
		// chap8.Single s = chap8.Single.getInstance(); // Single Ŭ������ ���������ڰ� default ��
	}
	
	protected void method2() {
		num = 200;
		System.out.println("chap8.packtest.Pack1 Ŭ������ method() �޼��� ��");
	}

}


class Pack2 {
	
	void method() {
		System.out.println("cahp8.packtest.Pack2 Ŭ������ method() �޼�����");
		Pack1 p = new Pack1();
		p.method(); // Pack2 Ŭ�������� Pack1 Ŭ������ method() �� ���� ����
		p.method2();
		// p.num = 300;
	}
	
}