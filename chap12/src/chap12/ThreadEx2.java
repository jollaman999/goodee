package chap12;

class Runname1 implements Runnable { // Thread Ŭ���� �ƴ�.

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			// Thread.currentThread() : ���� ���� ���� (Running ������) ������ ����
			System.out.println(i + "=" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}

public class ThreadEx2 {

	public static void main(String[] args) {
		System.out.println("main ������ ����");
		
		Runnable r = new Runname1();
		
		/*
		 * new Thread(r, "First")
		 * 		Thread ��ü�� ����. running �� �����ϴ� run() �޼���� r ���������� run() �޼��带 ����.
		 */
		Thread t1 = new Thread(r, "First");
		Thread t2 = new Thread(r, "Second");
		
		t1.start();
		t2.start();
		
		System.out.println("main ������ ����");
	}

}
