package chap9;

/*
 * ����Ŭ������ �ܺ�Ŭ������ ����̸��� ���� ��� ó��.
 */

class Outer3 {
	int iv = 10;
	int iv2 = 20;
	
	class InstanceInner {
		int iv = 100;
		void method() {
			int iv = 200;
			System.out.println("iv = " + iv);
			System.out.println("this.iv = " + this.iv);
			System.out.println("Outer3.this.iv = " + Outer3.this.iv);
		}
	}
}

public class InnerEx3 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner oic = out.new InstanceInner();
		oic.method();
	}

}
