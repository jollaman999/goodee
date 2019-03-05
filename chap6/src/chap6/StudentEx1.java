package chap6;

/*
 * Student Ŭ���� �����ϱ�
 * ������� : �̸� (name), ��(ban), ��ȣ(no), ��������(kor), ��������(eng), ��������(math)
 * 			static int count
 * ����޼���
 *    1. int getTotal() : �л��� ������ ������ ����
 *    2. float getAverage() : �л��� ���
 *    3. void info() : ��ȣ, �̸�, ��, ����, ����, ����, ����, ����� ���
 * ������
 *    1. �Ű����� (�̸�, ��, ��ȣ) : �̸�, ��, ��ȣ�� �ʱ�ȭ �ϰ� �������� 0���� �ʱ�ȭ
 *    							��ȣ�� count �� �ڵ� ����
 *    2. �Ű����� (�̸�, ��, ��ȣ, ����, ����, ����) : �̸�, ��, ��ȣ, ����, ����, ���� �ʱ�ȭ�ϱ�
 *    							��ȣ�� count �� �ڵ� ����
 */

class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	static int count;
	Student(String name, int ban) {
		this(name, ban, 0, 0, 0);
	}
	Student(String name, int ban, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		no = ++count;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (float) getTotal() / 3;
	}
	void info() {
		System.out.println("��ȣ : " + no + ", �̸� : " + name + ", �� : " + ban + ", ���� : " + kor
							+ ", ���� : " + eng + ", ����  : " + math
							+ ", ���� : " + getTotal() + ", ��� : " + String.format("%.2f", getAverage()));
	}
}

public class StudentEx1 {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] = new Student("�Ӽ���", 3);
		student[0].info();
		student[1] = new Student("ȫ�浿", 2, 97, 87, 45);
		student[1].info();
		student[2] = new Student("���", 2, 53, 64, 72);
		student[2].info();
	}

}
