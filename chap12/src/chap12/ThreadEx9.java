package chap12;

/*
 * ���� ������ : �Ϲ� �������� ���� ������ �ϴ� ������
 * 			�Ϲ� �����尡 ����Ǹ�, ���� �����嵵 ����ȴ�.
 * 
 */

class DaemonThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println(this);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx9 {

	public static void main(String[] args) {
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		
		t1.setDaemon(true); // ���� ������� ����
		t2.setDaemon(true); // ���� ������� ����
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
