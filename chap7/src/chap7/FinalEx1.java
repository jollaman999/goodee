package chap7;

/*
 * final ������ ����
 * 
 * final class : ���� Ŭ����
 * final method : ���� �޼���
 * final value : ���
 * 
 */

// final class Parent4 {
class Parent4 {
	// final void method() {
	void method() {
		System.out.println("Parent4 Ŭ������ �޼�����");
	}
}

class Child4 extends Parent4 {
	// final int val = 100; // �ڹٿ����� const ����� ������� ����
	int val = 100;
	
	final void method() {
		System.out.println("Child4 Ŭ������ �޼�����");
		System.out.println(val += 10);
	}
}

public class FinalEx1 {

	public static void main(String[] args) {
		
	}

}
