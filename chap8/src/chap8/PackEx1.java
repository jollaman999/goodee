package chap8;

// import chap8.packtest.Pack1; // Pack1 클래스의 패키지명 설정
import chap8.packtest.*; // chap8.packtest 패키지의 모든 클래스의 패키지명을 생략

class Test extends Pack1 {
	
	void testmethod() {
		// method();
		method2(); // protected 접근제어자이므로 접근 허용
	}
}

public class PackEx1 {

	public static void main(String[] args) {
		System.out.println("패키지 예제");
		Pack1 p = new Pack1();
		// p.method(); // default 이기 때문에 접근 안됨
		// p.method2(); // protected 이기 때문에 접근 안됨
		Test t = new Test();
		t.testmethod();
		Test2 t2 = new Test2();
		t2.testmethod();
	}

	Test t = new Test();
}
