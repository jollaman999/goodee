package chap9;

class Outer1 {
	class InstanceInner extends Object { // �ν��Ͻ� ��ø Ŭ����
		int iv = 100;
		final static int MAX = 200;
	}
	
	static class StaticInner { // static ��ø Ŭ����
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	
	void method() {
		class LocalInner { // ���� ��ø Ŭ����
			int iv = 600;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv + ", " + LocalInner.MAX);
	}
	
	void method2() {
		// LocalInner lc = new LocalInner();
	}
}

public class InnerEx1 {

	public static void main(String[] args) {
		// ��øŬ������ ��üȭ
		// 1. �ν��Ͻ� ��ø Ŭ����
		Outer1.InstanceInner ii = new Outer1().new InstanceInner();
		System.out.println(ii.iv);
		System.out.println(Outer1.InstanceInner.MAX);
		// 2. static ��ø Ŭ����
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);
		System.out.println(Outer1.StaticInner.cv);
		System.out.println(Outer1.StaticInner.MAX);
		new Outer1().method();
	}

}
