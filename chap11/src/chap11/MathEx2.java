package chap11;

/*
 * getRand() �޼��� �����ϱ�
 * 
 * 	�־��� ���� (-3 ~ 1) �� ���� ������ �������� ��ȯ. ���� ��谪�� ��� ������ ���Ե�.
 * 	�ΰ��� ���ڴ� ������� Ŀ�� ��� ����.
 * 	��ȯŸ�� : int
 */

public class MathEx2 {
	
	private static int getRand(int i1, int i2) {
		int min = i1, max = i2;
		int cnt;
		
		if (min > max) {
			int temp;
			temp = min;
			min = max;
			max = temp;
		}
		
		cnt = max - min + 1;
		
		int random = (int) (Math.random() * cnt) + min;
		
		return random;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(3, -10) + ",");
		}
		System.out.println();
	}

}
