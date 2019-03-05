package chap9.home;

class Outer2 {
	static class Inner { //내부클래스의 객체의 자료형
		int iv = 200;
	}
}

public class Test2 {
	public static void main(String[] args) {
		System.out.println(new Outer2.Inner().iv);
	}
}