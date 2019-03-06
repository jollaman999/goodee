package chap12;

class PrintRunnable2 implements Runnable {
	char ch;
	
	PrintRunnable2 (char ch) {
		this.ch = ch;
	}
	
	// lock 객체는 모든 스레드가 공유하는 객체여야 한다.
	// lock 객체는 반드시 객체여야 한다.(Object 객체 또는 Object 상속받은 객체)
	// 기본자료형의 변수는 lock 객체로 사용할 수 없다.
	
	//static Object Lock = new Object();
	static Integer Lock = 100;
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (Lock) { // 임계영역, 동기화 영역 (동기화 블럭)
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}

public class RunnableEx5 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintRunnable2('A'));
		Thread t2 = new Thread(new PrintRunnable2('B'));
		Thread t3 = new Thread(new PrintRunnable2('C'));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
