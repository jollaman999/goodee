package chap11.home;

/*
 * ���� ����� �������� ���ǵ� �޼��带 �����ϱ�
 * �޼���� : fillZero
 * ��� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ���
 *        �����, ���� �� ������ 0���� ä���.
 *        ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰�
 *        length�� ���� ������ �״�� ��ȯ�Ѵ�.
 *        ���� �־��� length�� ���� 0�� ���ų�, 
 *        ���� ���̸� �� ���ڿ�("")�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : String
 * �Ű����� : String src, int length
 * 
 [���]
0000012345

123
null
 */

public class Test4 {
	private static String fillZero(String src, int length) {
		StringBuffer output = new StringBuffer();
		int plus = 0;
		
		if (src != null && length > 0) {
			if (length > src.length()) {
				plus = length - src.length();
				for (int i = 0; i < plus; i ++) {
					output.append("0");
				}
				
				output.append(src);
			} else {
				output.append(src.substring(0, length));
			}
		} else if (src == null || length == src.length()) {
			return src;
		}
		
		return output.toString();
	}
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
		System.out.println(fillZero(null,3));
	}
}