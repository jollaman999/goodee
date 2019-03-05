package chap10;

/*
 * ������ ������ ������ ���α׷� �����ϱ�
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
			System.out.println("main ���� ����ó��");
		}
	}

	static void badmethod() throws MyException {
		try {
			throw new MyException("���� ���� ���� Ŭ������ ���� ���� �߻�");
		} catch (MyException e) {
			System.out.println("badmethod ���� ����ó��");
			throw e;
		}
	}

}
