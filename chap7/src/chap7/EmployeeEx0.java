package chap7;

class Employee0 {
	boolean isjunggyu;
	String name;
	String buseo;
	
	Employee0 (boolean isjunggyu, String name, String buseo) {
		this.isjunggyu = isjunggyu;
		this.name = name;
		this.buseo = buseo;
	}
	
	String ShowJungGyu() {
		if (isjunggyu) {
			return "������";
		} else {
			return "��������";
		}
	}
}

class FormalEmployee0 extends Employee0 {
	String num;
	
	FormalEmployee0 (String num, String name, String buseo) {
		super(true, name, buseo);
		this.num = num;
	}
	
	public String toString() {
		return super.ShowJungGyu() + ", ������ȣ : " + num + ", �̸� : " + name + ", �μ� : " + buseo;
	}
}

class InFormalEmployee0 extends Employee0 {
	String expire;
	
	InFormalEmployee0 (String name, String expire) {
		super(false, name, "");
		this.expire = expire;
	}
	
	public String toString() {
		return super.ShowJungGyu() + ", �̸� : " + name + ", ��� ������ : " + expire;
	}
}

/*
 * ����Ŭ���� (Employee)
 * 		1. ���� : ��������, �̸�, �ҼӺμ�
 * 		2. ������ :
 * 			��� ��� ������ �Ű������� ����.
 * �������� Ŭ���� (FormalEmployee)
 * 		1. ������ȣ
 * 		2. ������ :
 * 			������ȣ, �̸�, �ҼӺμ��� �Ű������� ����.
 * ���������� (InformalEmployee)
 * 		1. ��ุ����
 * 		2. ������ :
 * 			�̸�, ��� �������� �Ű������� ����.
 */

public class EmployeeEx0 {

	public static void main(String[] args) {
		FormalEmployee0 fe = new FormalEmployee0("0001", "ȫ�浿", "���ߺ�");
		InFormalEmployee0 ife = new InFormalEmployee0("ȫ�浿", "20191231");
		
		System.out.println(fe); // ����, ������ȣ, �̸�, �μ� ���
		System.out.println(ife); // ����, �̸�, ��� ������ ���
	}

}
