package chap9;

interface I {
	void test();
}

abstract class Abs {
	int x = 10;
	abstract void testmethod();
}

public class InnerEx4 {
	int x = 100;

	public static void main(String[] args) {
		int num = 10;
		
		I i = new I() {
			@Override
			public void test() {
				int num1 = 1;
				num1++;
				System.out.println("Interface I ��ü�� �޼�����. num = " + num1);
			}
		};
		//num++;
		i.test();
		
		Abs a = new Abs() {
			@Override
			void testmethod() {
				System.out.println("�߻�Ŭ���� abs ��ü�� testmethod �޼�����. num = " + num);
				System.out.println("x = " + x);
				System.out.println("InnerEx4.x = " + new InnerEx4().x);
			}
		};
		a.testmethod();
	}

}
