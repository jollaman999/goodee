package chap7;

/*
 * �ʱ�ȭ �� ����
 */

public class InitEx1 {
	static int cv;	// Ŭ���� ����
	int iv;			// �ν��Ͻ� ����
	InitEx1() {		// ������
		System.out.println("5. ������ ȣ���");
	}
	static {		// static(Ŭ����) �ʱ�ȭ ��
		cv = (int) (Math.random() * 100);	// 0~99
		System.out.println("1. static �ʱ�ȭ �� ���� cv = " + cv);
	}
	{
		System.out.println("4. �ν��Ͻ� �ʱ�ȭ �� ����. ������ ���� ���� �����.");
	}

	public static void main(String[] args) {
		System.out.println("2. main �޼��� ����");
		System.out.println("3. main ���� init1 ��ü ������");
		InitEx1 init1 = new InitEx1();
		System.out.println("6. main ���� init2 ��ü ������");
		InitEx1 init2 = new InitEx1();
	}

}
