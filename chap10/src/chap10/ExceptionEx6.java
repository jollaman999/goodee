package chap10;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main �޼��忡�� badmethod ���� ó��");
			e.printStackTrace();
		}
	}

	private static void badmethod() throws Exception {
		throw new Exception("���� ���� �߻�");
	}

}
