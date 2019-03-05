package chap9;

/*
 * 외부클래스의 private 멤버에 접근
 */

class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	
	class InstanceInner { // 외부클래스가 객체화 되어야 내부클래스의 객체화 가능
		int iiv = outeriv; // 외부클래스의 private 멤버 접근 가능
		int iiv2 = outercv;
	}
	
	static class StaticInner {
		int siv = new Outer2().outeriv;
		static int siv2 = new Outer2().outeriv;
		static int scv = outercv;
	}
	
	static StaticInner si = new StaticInner();
	InstanceInner ii = new InstanceInner();
	static InstanceInner ii2 = new Outer2().new InstanceInner();
	void method(final int pv) {
		final int i = 100;
		// i++;
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
			void method() {
				System.out.println("pv = " + pv);
				System.out.println("i = " + i);
				System.out.println("liv = " + liv);
				System.out.println("outeriv = " + outeriv);
			}
		}
		LocalInner lc = new LocalInner();
		lc.method();
	}
}

public class InnerEx2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);
		Outer2.InstanceInner oic = out.new InstanceInner();
		System.out.println(oic.iiv + ", " + oic.iiv2);
		Outer2.StaticInner osc = new Outer2.StaticInner();
		System.out.println(osc.siv + ", " + osc.scv + ", " + osc.siv2);
	}

}
