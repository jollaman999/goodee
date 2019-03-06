package chap12;

class InterruptThread extends Thread {
	@Override
	public void run() {
		System.out.println("�ڰ� �ֽ��ϴ�! ������ ������!");
		
		try {
			sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("���� ������?");
		}
	}
}

public class ThreadEx8 {

	public static void main(String[] args) {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		t1.interrupt(); // t1 �����忡 InterruptedException ���� �߻���
	}

}
