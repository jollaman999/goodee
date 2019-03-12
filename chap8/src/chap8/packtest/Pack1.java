package chap8.packtest;

public class Pack1 {
	private int num;
	
	void method() {
		num = 100;
		System.out.println("chap8.packtest.Pack1 클래스의 method() 메서드 임");
		// chap8.Single s = chap8.Single.getInstance(); // Single 클래스의 접근제어자가 default 임
	}
	
	protected void method2() {
		num = 200;
		System.out.println("chap8.packtest.Pack1 클래스의 method() 메서드 임");
	}

}


class Pack2 {
	
	void method() {
		System.out.println("cahp8.packtest.Pack2 클래스의 method() 메서드임");
		Pack1 p = new Pack1();
		p.method(); // Pack2 클래스에서 Pack1 클래스의 method() 에 접근 가능
		p.method2();
		// p.num = 300;
	}
	
}