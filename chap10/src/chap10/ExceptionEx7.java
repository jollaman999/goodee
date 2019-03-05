package chap10;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main ���� ���� ó��. message=" + e.getMessage());
		}
	}

	private static void badmethod() throws Exception {
		try {
			throw new Exception("badmethod ������ ���� ��ü");
		} catch (Exception e) {
			System.out.println("badmethod ����ó��. message=" + e.getMessage());
			throw e;
		}
	}

}
