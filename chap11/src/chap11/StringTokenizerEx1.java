package chap11;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String text = "Ȧ�뵿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		int cnt = st.countTokens(); // ���� �����ִ� ��ū�� ����
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(st.nextToken()); // ��ū �Ѱ��� ������
			System.out.println(st.countTokens());
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
			System.out.println(st.hasMoreTokens());
		}
		
		System.out.println();
		
		String[] tarr = text.split("/");
		for (int i = 0; i < tarr.length; i++) {
			System.out.println(tarr[i]);
		}
	}

}
