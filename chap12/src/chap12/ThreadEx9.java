package chap12;

/*
 * 데몬 스레드 : 일반 스레드의 보조 역할을 하는 스레드
 * 			일반 스레드가 종료되면, 데몬 스레드도 종료된다.
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
		
		t1.setDaemon(true); // 데몬 스레드로 설정
		t2.setDaemon(true); // 데몬 스레드로 설정
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
