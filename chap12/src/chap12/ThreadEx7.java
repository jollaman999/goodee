package chap12;

// join() : �����尡 ������ ������ ���

class JoinThread extends Thread {
	int sum = 0;
	
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
	}
}

public class ThreadEx7 {

	public static void main(String[] args) {
		System.out.println("�����带 �̿��Ͽ� 100������ �� ���ϱ�");
		JoinThread t1 = new JoinThread();
		t1.start();
		try {
			t1.join(); // t1 �����尡 �����Ҷ����� main �޼��� ���
		} catch (InterruptedException e) {
		}
		System.out.println("��� : " + t1.sum);
	}

}
