package chap12;

class Runname1 implements Runnable { // Thread 클래스 아님.

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			// Thread.currentThread() : 현재 실행 중인 (Running 상태인) 스레드 리턴
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
		System.out.println("main 스레드 시작");
		
		Runnable r = new Runname1();
		
		/*
		 * new Thread(r, "First")
		 * 		Thread 객체를 생성. running 을 수행하는 run() 메서드는 r 참조변수의 run() 메서드를 수행.
		 */
		Thread t1 = new Thread(r, "First");
		Thread t2 = new Thread(r, "Second");
		
		t1.start();
		t2.start();
		
		System.out.println("main 스레드 종료");
	}

}
