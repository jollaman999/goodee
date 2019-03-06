package chap12;

/*
 * ����ȭ ���� 2 : synchronized ���� �����
 * 	1. ����ȭ ��
 * 	2. ����ȭ �޼��� <== ����
 * 
 * 	����ȭ �޼��� ���� ������ü�� �����ؾ� �Ѵ�.
 */

class PrintThread3 extends Thread {
	Printer ptr;
	char ch;
	
	PrintThread3(char ch, Printer ptr) {
		this.ch = ch;
		this.ptr = ptr;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			ptr.printChar(ch);
		}
	}
}

class Printer {
	public synchronized void printChar(char ch) { // ����ȭ �޼���
		for (int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

public class ThreadEx6 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread3 t1 = new PrintThread3('A', ptr);
		PrintThread3 t2 = new PrintThread3('B', ptr);
		PrintThread3 t3 = new PrintThread3('C', ptr);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
