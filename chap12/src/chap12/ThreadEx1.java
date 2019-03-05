package chap12;

/*
 * Thread 객체 생성하기
 * 1. Thread 클래스를 상속받아 스레드 생성
 */

class Thread1 extends Thread {
	Thread1 (String name) {
		super(name);
	}
	
	@Override
	public void run() { // 3. Running 상태. run 메서드 실행 상태
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "=" + getName());
			
			if (i == 5) {
				break;
			}
			
			try {
				sleep(1000); // 4. 대기 상태. => 대기 상태 종료시 Runnable 상태.
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println(getName() + " 종료");
	} // 5. Dead 상태
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		
		Thread1 t1 = new Thread1("First"); // 1. new 상태
		Thread1 t2 = new Thread1("Second"); // 2. new 상태
		
		/*
		 * start() : 스레드의 시작
		 * 1. 스택영역을 병렬화함.
		 * 2. 스택영역 run() 메서드 호출.
		 */
		
		t1.run(); // 2. Runnable 상태. 실행 가능 상태. 경합 상태.
		t2.run();
		
		System.out.println("main 스레드 종료");
	}

}
