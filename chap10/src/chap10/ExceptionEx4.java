package chap10;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println("main �޼��� ����");
		try {
			first();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main �޼��� ����");
	}

	private static void first() throws Exception {
		System.out.println("first �޼��� ȣ��");
		second();
		System.out.println("first �޼��� ����");
	}

	private static void second() throws Exception {
		System.out.println("second �޼��� ȣ��");
		// System.out.println(10/0); // ArithmeticException �߻�
		System.out.println("second �޼��� ����");
	}

}
