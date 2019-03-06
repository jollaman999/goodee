package chap12;

/*
 * ����ȭ ���� : synchronized ���� �����
 * 
 * 	1. ����ȭ �� <== ����
 * 	2. ����ȭ �޼���
 */

class PrintThread2 extends Thread {
	char ch;
	
	PrintThread2 (char ch) {
		this.ch = ch;
	}
	
	// lock ��ü�� ��� �����尡 �����ϴ� ��ü���� �Ѵ�.
	// lock ��ü�� �ݵ�� ��ü���� �Ѵ�.(Object ��ü �Ǵ� Object ��ӹ��� ��ü)
	// �⺻�ڷ����� ������ lock ��ü�� ����� �� ����.
	
	//static Object Lock = new Object();
	static Integer Lock = 100;
	
	@Override
	public void run() {
		for (int i = 0; i < 20000; i++) {
			synchronized (Lock) { // �Ӱ迵��, ����ȭ ���� (����ȭ ��)
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}

public class ThreadEx5 {

	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		
		t1.start();
		t2.start();
		t3.start();
	}

}
