package chap12;

// join() : 스레드가 종료할 때까지 대기

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
		System.out.println("스레드를 이용하여 100까지의 합 구하기");
		JoinThread t1 = new JoinThread();
		t1.start();
		try {
			t1.join(); // t1 스레드가 종요할때까지 main 메서드 대기
		} catch (InterruptedException e) {
		}
		System.out.println("결과 : " + t1.sum);
	}

}
