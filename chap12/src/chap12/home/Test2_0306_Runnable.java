package chap12.home;

class SumRunnable implements Runnable {
	int sum = 0;
	int start;
	int end;
	
	public SumRunnable(int start, int end, String name) {
		this.start = start;
		this.end = end;
		Thread.currentThread().setName(name);
	}
	
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(Thread.currentThread().getName() + " : " + start
				+ "~" + end + "까지 합 - " + sum);
	}
}

public class Test2_0306_Runnable {

	public static void main(String[] args) throws InterruptedException {	
		SumRunnable[] sum_runnables = new SumRunnable[5];
		int all_sum = 0;
		
		sum_runnables[0] = new SumRunnable(1, 200, "t1");
		sum_runnables[1] = new SumRunnable(201, 400, "t2");
		sum_runnables[2] = new SumRunnable(401, 600, "t3");
		sum_runnables[3] = new SumRunnable(601, 800, "t4");
		sum_runnables[4] = new SumRunnable(801, 1000, "t5");
		
		Thread[] sum_threads = new Thread[5];
		
		for (int i = 0; i < sum_runnables.length; i++) {
			sum_threads[i] = new Thread(sum_runnables[i]);
			sum_threads[i].start();
		}
		
		for (int i = 0; i < sum_threads.length; i++) {
			sum_threads[i].join();
			all_sum += sum_runnables[i].sum;
		}
		
		System.out.println("1~1000 까지의 합 : " + all_sum);
	}

}
