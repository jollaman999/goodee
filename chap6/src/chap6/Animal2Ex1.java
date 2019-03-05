package chap6;

/*
 * ���� Ŭ������ ���������� ����Ǿ� �����
 * ������ : 26�� �� ��� �ǵ��� Animal2 Ŭ���� �����ϱ�
 */

class Animal2 {
	String name;
	int age;
	Animal2(String s, int a) {
		name = s;
		age = a;
	}
	Animal2(String s) {
		name = s;
		age = 1;
	}
	Animal2(int a) {
		name = "���";
		age = a;
	}
	void info() {
		System.out.println(name + " : " + age + "��");
	}
}

public class Animal2Ex1 {

	public static void main(String[] args) {
		Animal2 a1 = new Animal2("������", 26);
		a1.info();
		Animal2 a2 = new Animal2("������");
		a2.info();
		Animal2 a3 = new Animal2(20);
		a3.info();
	}

}
