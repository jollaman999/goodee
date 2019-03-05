package chap6;

class Number1 { // 기본 생성자를 가지고 있는 클래스
	int num;
}

class Number2 {
	int num;
	Number2(int x) { // 생성자, 기본생성자 제공 안됨
		num = x;
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		Number1 n1 = new Number1();
		n1.num = 100;
		System.out.println("Number1.num = " + n1.num);
		Number2 n2 = new Number2(100);
		System.out.println("Number2.num = " + n2.num);
	}

}
