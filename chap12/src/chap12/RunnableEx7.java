package chap12;

class JoinRunnable implements Runnable {
	int sum = 0;
	
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
	}
}

public class RunnableEx7 {

	public static void main(String[] args) {
		System.out.println("�����带 �̿��Ͽ� 100������ �� ���ϱ�");
		JoinRunnable r1 = new JoinRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		try {
			t1.join(); // t1 �����尡 �����Ҷ����� main �޼��� ���
		} catch (InterruptedException e) {
		}
		System.out.println("��� : " + r1.sum);
	}

}
