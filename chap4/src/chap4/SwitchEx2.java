package chap4;

public class SwitchEx2 {

	public static void main(String[] args) {
		/*
		 * Math.random() : ����, ������ �� ����
		 * 0 <= x < 1.0
		 * 0 <= x * 3 < 3.0
		 * 0 <= (int)(x * 3) < 3
		 * 	num : 0, 1, 2 �� �Ѱ��� ���� ������
		 */
		
		int num = (byte)(Math.random() * 3);
		
		/*
		 * switch �������� ���� ������ ����� �� �ִ� �ڷ���
		 * byte, short, int, char, String
		 */
		
		switch (num) {
			case 0: System.out.println("0���� ���� �Ǿ����ϴ�."); break;
			case 1: System.out.println("1���� ���� �Ǿ����ϴ�."); break;
			case 2: System.out.println("2���� ���� �Ǿ����ϴ�."); break;
		}
	}

}
