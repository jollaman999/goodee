package chap10;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리. message=" + e.getMessage());
		}
	}

	private static void badmethod() throws Exception {
		try {
			throw new Exception("badmethod 생성한 예외 객체");
		} catch (Exception e) {
			System.out.println("badmethod 예외처리. message=" + e.getMessage());
			throw e;
		}
	}

}
