package chap10;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main 메서드에서 badmethod 예외 처리");
			e.printStackTrace();
		}
	}

	private static void badmethod() throws Exception {
		throw new Exception("예외 강제 발생");
	}

}
