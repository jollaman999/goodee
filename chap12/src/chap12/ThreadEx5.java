package chap12;

/*
 * 동기화 예제 : synchronized 예약어를 사용함
 * 
 * 	1. 동기화 블럭 <== 예제
 * 	2. 동기화 메서드
 */

class PrintThread2 extends Thread {
	char ch;
	
	PrintThread2 (char ch) {
		this.ch = ch;
	}
	
	// lock 객체는 모든 스레드가 공유하는 객체여야 한다.
	// lock 객체는 반드시 객체여야 한다.(Object 객체 또는 Object 상속받은 객체)
	// 기본자료형의 변수는 lock 객체로 사용할 수 없다.
	
	//static Object Lock = new Object();
	static Integer Lock = 100;
	
	@Override
	public void run() {
		for (int i = 0; i < 20000; i++) {
			synchronized (Lock) { // 임계영역, 동기화 영역 (동기화 블럭)
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}

public class ThreadEx5 {

	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		
		t1.start();
		t2.start();
		t3.start();
	}

}
