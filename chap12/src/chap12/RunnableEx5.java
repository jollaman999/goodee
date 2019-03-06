package chap12;

class PrintRunnable2 implements Runnable {
	char ch;
	
	PrintRunnable2 (char ch) {
		this.ch = ch;
	}
	
	// lock ��ü�� ��� �����尡 �����ϴ� ��ü���� �Ѵ�.
	// lock ��ü�� �ݵ�� ��ü���� �Ѵ�.(Object ��ü �Ǵ� Object ��ӹ��� ��ü)
	// �⺻�ڷ����� ������ lock ��ü�� ����� �� ����.
	
	//static Object Lock = new Object();
	static Integer Lock = 100;
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (Lock) { // �Ӱ迵��, ����ȭ ���� (����ȭ ��)
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}

public class RunnableEx5 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintRunnable2('A'));
		Thread t2 = new Thread(new PrintRunnable2('B'));
		Thread t3 = new Thread(new PrintRunnable2('C'));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
