package chap9.home;

class Outer2 {
	static class Inner { //����Ŭ������ ��ü�� �ڷ���
		int iv = 200;
	}
}

public class Test2 {
	public static void main(String[] args) {
		System.out.println(new Outer2.Inner().iv);
	}
}