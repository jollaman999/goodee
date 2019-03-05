package chap10;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		try {
			first();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main 메서드 종료");
	}

	private static void first() throws Exception {
		System.out.println("first 메서드 호출");
		second();
		System.out.println("first 메서드 종료");
	}

	private static void second() throws Exception {
		System.out.println("second 메서드 호출");
		// System.out.println(10/0); // ArithmeticException 발생
		System.out.println("second 메서드 종료");
	}

}
