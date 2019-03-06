package chap12.home;

class SumThread extends Thread {
	int sum = 0;
	int start;
	int end;
	
	public SumThread(int start, int end, String name) {
		this.start = start;
		this.end = end;
		this.setName(name);
	}
	
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(this.getName() + " : " + start
				+ "~" + end + "까지 합 - " + sum);
	}
}

public class Test2_0306_Thread {

	public static void main(String[] args) {
		SumThread[] sum_threads = new SumThread[5];
		int all_sum = 0;
		
		sum_threads[0] = new SumThread(1, 200, "t1");
		sum_threads[1] = new SumThread(201, 400, "t2");
		sum_threads[2] = new SumThread(401, 600, "t3");
		sum_threads[3] = new SumThread(601, 800, "t4");
		sum_threads[4] = new SumThread(801, 1000, "t5");
		
		for (int i = 0; i < 5; i++) {
			sum_threads[i].start();
			try {
				sum_threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			all_sum += sum_threads[i].sum;
		}
		
		System.out.println("1~1000 까지의 합 : " + all_sum);
	}

}
