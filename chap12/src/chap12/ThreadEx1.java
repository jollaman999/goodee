package chap12;

/*
 * Thread ��ü �����ϱ�
 * 1. Thread Ŭ������ ��ӹ޾� ������ ����
 */

class Thread1 extends Thread {
	Thread1 (String name) {
		super(name);
	}
	
	@Override
	public void run() { // 3. Running ����. run �޼��� ���� ����
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "=" + getName());
			
			if (i == 5) {
				break;
			}
			
			try {
				sleep(1000); // 4. ��� ����. => ��� ���� ����� Runnable ����.
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println(getName() + " ����");
	} // 5. Dead ����
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("main ������ ����");
		
		Thread1 t1 = new Thread1("First"); // 1. new ����
		Thread1 t2 = new Thread1("Second"); // 2. new ����
		
		/*
		 * start() : �������� ����
		 * 1. ���ÿ����� ����ȭ��.
		 * 2. ���ÿ��� run() �޼��� ȣ��.
		 */
		
		t1.run(); // 2. Runnable ����. ���� ���� ����. ���� ����.
		t2.run();
		
		System.out.println("main ������ ����");
	}

}
