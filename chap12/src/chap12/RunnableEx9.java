package chap12;

class DaemonRunnable implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().toString());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableEx9 {

	public static void main(String[] args) {
		Runnable r = new DaemonRunnable();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setDaemon(true); // ���� ������� ����
		t2.setDaemon(true); // ��� ������� ����
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
