package chap10;

public class ExceptionEx5 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}
	}

}
