package chap10;

/*
 * 컴파일 오류가 없도록 프로그램 수정하기
 */

class MyException extends Exception {
	public MyException(String str) {
		super(str);
	}
}

public class ExceptionEx11 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (MyException e) {
			System.out.println("main 에서 예외처리");
		}
	}

	static void badmethod() throws MyException {
		try {
			throw new MyException("내가 만든 예외 클래스로 예외 강제 발생");
		} catch (MyException e) {
			System.out.println("badmethod 에서 예외처리");
			throw e;
		}
	}

}
