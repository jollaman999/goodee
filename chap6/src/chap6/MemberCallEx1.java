package chap6;

/*
 * 클래스 멤버와 인스턴스 멤버간의 호출 예제
 */

public class MemberCallEx1 {
	
	static int cv1 = 10;
	static int cv2 = cv1;
	int iv1 = 100;
	int iv2 = iv1;

	public static void main(String[] args) {
		//cv2 = iv1; // error
		//method1();
		
		MemberCallEx1 m = new MemberCallEx1();
		cv2 = m.iv1;
		m.method1();
		
		method2();
	}

	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
		method2();
	}
	static void method2() {
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println(cv1 + cv2);
		System.out.println(m.iv1 + m.iv2);
	}
}
