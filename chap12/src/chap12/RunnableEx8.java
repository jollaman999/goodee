package chap12;

class InterruptRunnale implements Runnable {
	@Override
	public void run() {
		System.out.println("�ڰ� �ֽ��ϴ�! ������ ������!");
		
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("���� ������?");
		}
	}
}

public class RunnableEx8 {

	public static void main(String[] args) {
		Runnable r = new InterruptRunnale();
		Thread t1 = new Thread(r);
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt(); // t1 �����忡 InterruptedException ���� �߻���
	}

}
