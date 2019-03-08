package chap12;

class ThreadPriority_r implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
		
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread());
			/*
			 * Thread.toString()
			 * Thread[First, 1, main]
			 * First : 스레드 이름
			 * 1 : 우선순위 값
			 * main : 스레드 그룹 이름
			 */
		}
	}
}

public class RunnableEx3 {
	public static void main(String[] args) {
		System.out.println("높은 우선 순위  : " + Thread.MAX_PRIORITY);
		System.out.println("기본 우선 순위  : " + Thread.NORM_PRIORITY);
		System.out.println("낮은 우선 순위  : " + Thread.MIN_PRIORITY);
		
		ThreadPriority_r r = new ThreadPriority_r();
		
		Thread t1 = new Thread(r, "First");
		Thread t2 = new Thread(r, "Second");
		Thread t3 = new Thread(r, "Third");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
