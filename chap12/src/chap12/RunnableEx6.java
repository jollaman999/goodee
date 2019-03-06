package chap12;

class PrintRunnable3 implements Runnable {
	Printer_r ptr;
	char ch;
	
	PrintRunnable3(char ch, Printer_r ptr) {
		this.ch = ch;
		this.ptr = ptr;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			ptr.printChar(ch);
		}
	}
}

class Printer_r {
	public synchronized void printChar(char ch) { // 동기화 메서드
		for (int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

public class RunnableEx6 {

	public static void main(String[] args) {
		Printer_r ptr = new Printer_r();
		
		Thread t1 = new Thread(new PrintRunnable3('A', ptr));
		Thread t2 = new Thread(new PrintRunnable3('B', ptr));
		Thread t3 = new Thread(new PrintRunnable3('C', ptr));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
