package chap10.home;

/*
 * main �޼��忡�� method1() �޼��带 ȣ���Ͽ�
 * 
 * 30
 * 20
 * 10
 * 
 * �� �������� ���α׷� �ۼ��ϱ�
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
