package chap10.home;

public class Test2 {
	
	static void method(boolean b) {
		try {
			System.out.print(1);
			if (b) {
				throw new ArithmeticException();
			}
			System.out.print(2);
		} catch (RuntimeException e) {
			System.out.print(3);
			return; // finally �� �����ϰ� ������.
		} catch (Exception e) {
			System.out.print(4);
			return;
		} finally {
			System.out.print(5);
		}
		System.out.print(6);
	}

	public static void main(String[] args) {
		//
		// ���� ���� 1�� ǥ�� �ǰ�
		// true �̹Ƿ� ArithmeticException �� ����ǰ�
		// ArithmeticException �� RuntimeException �� ���Ͽ�
		// 3�� ǥ�õȴ�.
		// ���������� finally �� 5�� ǥ�õǰ� ����
		method(true);
		
		//
		// ���� ���� 1�� ǥ�� �ǰ�
		// false �̹Ƿ� �Ʒ������� 2�� ǥ�õǰ�
		// ���� Exception �ɸ��� �ʾ� finally �� 5�� ǥ�õǰ�
		// ���� Exception �ɸ��� �����Ƿ� 6�� ǥ���ϰ� ����
		method(false);
	}

}
