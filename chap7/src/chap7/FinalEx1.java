package chap7;

/*
 * final 제어자 예제
 * 
 * final class : 종단 클래스
 * final method : 종단 메서드
 * final value : 상수
 * 
 */

// final class Parent4 {
class Parent4 {
	// final void method() {
	void method() {
		System.out.println("Parent4 클래스의 메서드임");
	}
}

class Child4 extends Parent4 {
	// final int val = 100; // 자바에서는 const 예약어 사용하지 않음
	int val = 100;
	
	final void method() {
		System.out.println("Child4 클래스의 메서드임");
		System.out.println(val += 10);
	}
}

public class FinalEx1 {

	public static void main(String[] args) {
		
	}

}
