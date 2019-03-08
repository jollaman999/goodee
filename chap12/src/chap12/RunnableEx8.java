package chap12;

class InterruptRunnale implements Runnable {
	@Override
	public void run() {
		System.out.println("자고 있습니다! 깨우지 마세요!");
		
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("누가 깨웠니?");
		}
	}
}

public class RunnableEx8 {

	public static void main(String[] args) {
		Runnable r = new InterruptRunnale();
		Thread t1 = new Thread(r);
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt(); // t1 스레드에 InterruptedException 예외 발생함
	}

}
