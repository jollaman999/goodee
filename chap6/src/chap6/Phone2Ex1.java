package chap6;

class Phone2 {
	String color;
	boolean power;
	String no;
	int serialno;
	static int cnt;
	void power() {
		power = !power;
	}
	void send(String no) {
		System.out.println(no + "�� ��ȭ�� �Ŵ� ��~");
	}
	void receive(String no) {
		System.out.println(no + "�� ��ȭ�� �޴� ��~");
	}
	public String toString() {
		return serialno + ":" + color + ", " + no;
	}
}

public class Phone2Ex1 {
	public static void main(String[] args) {
		Phone2[] p = new Phone2[3];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Phone2();
			p[i].color = "���";
			p[i].no = "����";
			p[i].serialno = ++p[i].cnt;
		}
		System.out.println(Phone2.cnt);
		for (Phone2 p2 : p) {
			System.out.println(p2);
		}
	}
}
