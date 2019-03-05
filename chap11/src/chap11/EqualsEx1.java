package chap11;

/*
 * Object Ŭ������ equals ���� : ���� �񱳸� �ϱ� ���� ��� ���� �޼���
 * 				�⺻���� : ���� ��ü ���θ� ���� == �������� ��� ����
 * 				=> ���� �񱳸� ���ؼ��� �������̵� �ʿ�
 */

class Equal {
	int value;
	
	Equal(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equal) {
			Equal e = (Equal)obj;
			return this.value == e.value;
		}
		return false;
	}
	
}

public class EqualsEx1 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(20);
		
		if (e1 == e2) {
			System.out.println("e1 ��ü�� e2 ��ü�� ���� ��ü��");
		} else {
			System.out.println("e1 ��ü�� e2 ��ü�� �ٸ� ��ü��");
		}
		
		if (e1.equals(e2)) {
			System.out.println("e1 ��ü�� e2 ��ü�� ���� ������ ���� ��ü��");
		} else {
			System.out.println("e1 ��ü�� e2 ��ü�� �ٸ� ������ ���� ��ü��");
		}
	}

}
