package chap4;

/*
 * 1���� 100������ ���� 2�� ����� �ƴϰ� 3�� ����� �ƴѼ��� ���� ���Ͽ� ���
 */

public class LoopEx10 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
