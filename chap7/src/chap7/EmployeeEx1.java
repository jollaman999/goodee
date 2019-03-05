package chap7;

abstract class Employee {
	String type; // ��������
	String name; // �̸�
	
	Employee(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	abstract int getPay(); // �޿�
}

class FormalEmployee extends Employee { // ��������
	String empNo; // ������ȣ
	String position; // ����
	int salary; // ����
	
	FormalEmployee(String name, String empNo, int salary, String position) {
		super("����", name);
		
		this.empNo = empNo;
		this.salary = salary;
		this.position = position;
	}
	
	@Override
	int getPay() {
		return salary / 12;
	}
}

class InformalEmployee extends Employee { // ����������
	String expireDate; // ��ุ����
	int primaryPay; // �⺻�ӱ�
	
	InformalEmployee(String name, String expireDate, int primaryPay) {
		super("������", name);
		
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	
	InformalEmployee(String type, String name, String expireDate, int primaryPay) {
		super(type, name);
		
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	
	@Override
	int getPay() {
		return this.primaryPay;
	}
}

class TempEmployee extends InformalEmployee { // �ӽ�����
	int timePay; // �ð��� �ӱ�
	int empTime; // �ٹ��ð�
	
	TempEmployee(String name, String expireDate, int primaryPay, int empTime, int timePay) {
		super("�ӽ�", name, expireDate, primaryPay);
		
		this.empTime = empTime;
		this.timePay = timePay;
	}
	
	@Override
	int getPay() {
		return this.primaryPay + (this.timePay * this.empTime);
	}
}

class InternEmployee extends InformalEmployee { // ���� ���
	double payRate; // �ӱ�������
	
	InternEmployee(String name, String expireDate, int primaryPay, double payRate) {
		super("����", name, expireDate, primaryPay);
		
		this.payRate = payRate;
	}
	
	@Override
	int getPay() {
		return (int) (this.primaryPay * this.payRate);
	}
}

public class EmployeeEx1 {

	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		
		emps[0] = new FormalEmployee("������", "1", 5000, "����");
		emps[1] = new InformalEmployee("�̺���", "20191231", 1000);
		emps[2] = new TempEmployee("���ӽ�", "20191231", 0, 1, 50);
		emps[3] = new InternEmployee("������", "20191231", 2000, 0.8f);
		
		for (Employee e : emps) {
			System.out.println(e.type + "��� :" + e.name + "�� �޿� : " + e.getPay());
		}
	}

}
