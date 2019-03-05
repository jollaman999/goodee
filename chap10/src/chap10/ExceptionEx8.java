package chap10;

public class ExceptionEx8 {

	public static void main(String[] args) {
		badmethod();
	}

	private static void badmethod() {
		throw new RuntimeException("예외 강제 발생");
	}

}
