package chap10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(10 / Integer.parseInt(args[0]));
			String s = null;
			System.out.println(s.trim());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command ���ο� �Ķ���͸� �Է��ϼ���!");
		} catch (ArithmeticException e) {
			System.out.println("command ���ο� 0�� �Է����� ������!");
		} catch (NumberFormatException e) {
			System.out.println("command ���ο� ���ڸ� �Է��ϼ���!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����η� ���� �ּ���!");
		}
	}

}
