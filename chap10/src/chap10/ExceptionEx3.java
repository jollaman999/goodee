package chap10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println("�۾� ����");
			System.out.println("�۾� ��");
			int num = 10 / 0;
			System.out.println("�۾� �Ϸ�");
		} catch (Exception e) {
			System.out.println("�۾� �� ���� �߻�");
			return;
		} finally {
			System.out.println("�۾� ������ �ϱ�");
		}
		// ���� �Ұ�
		System.out.println("���α׷� ����");
	}

}
