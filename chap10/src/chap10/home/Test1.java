package chap10.home;

/*
 * main 메서드에서 method1() 메서드를 호출하여
 * 
 * 30
 * 20
 * 10
 * 
 * 이 나오도록 프로그램 작성하기
 */

class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	}
}

public class Test1 {

	public static void main(String[] args) {
		new Outer().new Inner().method1();
	}

}
