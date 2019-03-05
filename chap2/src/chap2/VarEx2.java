package chap2;

/*
 * ����ȯ ����
 * 1. �⺻�ڷ��� 8���� �� boolean�� ������ 7���� �ڷ����� ����ȯ�� �����ϴ�.
 * 		�ڵ�����ȯ : ����ȯ ������ ��������
 * 		����� ����ȯ : ����ȯ �����ڸ� �����.
 * 
 * <---- �ڵ�����ȯ �ٰ���, ����� ����ȯ
 * -----> ��������ȯ ����
 * byte short  int  long  float  double 
 *      char
 *
 *2. �⺻�ڷ����� �����ڷ��� ���� ����ȯ�� �Ұ���. �� Wrapper Ŭ������ ������.
 *3. String Ŭ������ ������ �� �����ϰ� + �����ڸ� �̿��Ͽ� String ������ ����ȯ�� ������.
 *
 *   String <= String + �⺻��
 */
public class VarEx2 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2); // byte + byte �� int �̹Ƿ� ����� ����ȯ�� �Ѵ�.
		long l1 = 100, l2 = 200;
		long l3 = l1 + l2;
		
		// float > long : float �ڷ����� long ���� ū �ڷ�����.
		float f1 = l3; // �ڵ� ����ȯ
		l1 = (long) f1; // ����� ����ȯ
		
		char c1 = 'A';
		int i1 = c1;
		System.out.println("c1=" + c1); // c1 = A
		System.out.println("i1=" + i1); // i1 = 65
		
		// A -> 65, a -> 97
		
		// ���� : �빮�ڿ� �ҹ��ڴ� 32�� ��ŭ ���̳���. c1 ������ �̿��Ͽ� �ҹ��� a ����ϱ�
		System.out.println((char)(c1 + 32));
		System.out.println(1 + 2 + 3 + "��");
		System.out.println("��ȣ : " + 1 + 2 + 3);
	}

}
