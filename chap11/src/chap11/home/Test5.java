package chap11.home;

/*
 * ����� �������� �޼��� �����ϱ�
 * �޼���� : format
 * ��� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ.
 *        ������ ������ ��������ä���.
 * ��ȯŸ�� : String
 * �Ű����� : String str, int length, int alignment
 *                                 (0 : ���� ����, 1: ��� ����, 2:������ ����)
 [���]
 ������****
**������**
****������
����           
 */

public class Test5 {
	private static String format(String str, int length, int alignment) {
		StringBuffer output = new StringBuffer();
		
		if (length <= str.length()) {
			output.append(str.substring(0, length));
			return output.toString();
		}
		
		
		for (int i = 0; i < length; i ++) {
			output.append("*");
		}
		
		switch (alignment) {
		case 0:
			output.replace(0, str.length(), str);
			break;
		case 1:
			int start = (length - str.length()) / 2;
			output.replace(start, start + str.length(), str);
			break;
		case 2:
			output.replace(length - str.length(), length, str);
			break;

		default:
			output.append("�߸��� ���� ����!");
			break;
		}
		
		return output.toString();
	}
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str, 7,0));
		System.out.println(format(str, 7,1));
		System.out.println(format(str, 7,2));
		System.out.println(format(str, 2,0));
	}
}