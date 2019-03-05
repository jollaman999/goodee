package chap2;

/*
 * 형변환 예제
 * 1. 기본자료형 8가지 중 boolean을 제외한 7개의 자료형은 형변환이 가능하다.
 * 		자동형변환 : 형변환 연산자 생략가능
 * 		명시적 형변환 : 형변환 연산자를 기술함.
 * 
 * <---- 자동형변환 줄가능, 명시적 형변환
 * -----> 저동형변환 가능
 * byte short  int  long  float  double 
 *      char
 *
 *2. 기본자료형과 참조자료형 간의 형변환은 불가함. 단 Wrapper 클래스는 예외임.
 *3. String 클래스는 참조형 중 유일하게 + 연산자를 이용하여 String 형으로 형변환이 가능함.
 *
 *   String <= String + 기본형
 */
public class VarEx2 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2); // byte + byte 는 int 이므로 명시적 형변환을 한다.
		long l1 = 100, l2 = 200;
		long l3 = l1 + l2;
		
		// float > long : float 자료형이 long 보다 큰 자료형임.
		float f1 = l3; // 자동 형변환
		l1 = (long) f1; // 명시적 형변환
		
		char c1 = 'A';
		int i1 = c1;
		System.out.println("c1=" + c1); // c1 = A
		System.out.println("i1=" + i1); // i1 = 65
		
		// A -> 65, a -> 97
		
		// 문제 : 대문자와 소문자는 32값 만큼 차이난다. c1 변수를 이용하여 소문자 a 출력하기
		System.out.println((char)(c1 + 32));
		System.out.println(1 + 2 + 3 + "번");
		System.out.println("번호 : " + 1 + 2 + 3);
	}

}
