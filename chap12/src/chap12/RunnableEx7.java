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
		System.out.println("스레드를 이용하여 100까지의 합 구하기");
		JoinRunnable r1 = new JoinRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		try {
			t1.join(); // t1 스레드가 종요할때까지 main 메서드 대기
		} catch (InterruptedException e) {
		}
		System.out.println("결과 : " + r1.sum);
	}

}
