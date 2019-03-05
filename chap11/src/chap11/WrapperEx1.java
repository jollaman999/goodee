package chap11;

public class WrapperEx1 {

	public static void main(String[] args) {
		Integer i1 = 100; // auto Boxing
		Integer i2 = 100;
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		if (i1.equals(i2)) {
			System.out.println("i1 i2 같음");
		} else {
			System.out.println("i1 i2 다름");
		}
		
		if (i1 == i2) {
			System.out.println("i1 i2 같음");
		} else {
			System.out.println("i1 i2 다름");
		}
		
		Integer i3 = new Integer(100); // auto Unboxing
		Integer i4 = new Integer(100);
		
		if (i3 == i4) {
			System.out.println("i3 i4 같음");
		} else {
			System.out.println("i3 i4 다름");
		}
		
		if (i3.equals(i4)) {
			System.out.println("i3 i4 같음");
		} else {
			System.out.println("i3 i4 다름");
		}
		
		System.out.println("int 형 값의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int 형 값의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int의 bit수 : " + Integer.SIZE);
		
		// byte 형의 최대값, 최소값, bit 갯수
		System.out.println("byte 형 값의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte 형 값의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte의 bit수 : " + Byte.SIZE);
		
		System.out.println("double 형 값의 최대값 : " + Double.MAX_VALUE);
		System.out.println("double 형 값의 최소값 : " + Double.MIN_VALUE);
		System.out.println("double의 bit수 : " + Double.SIZE);
		
		// 정수 문자열을 int로 변환
		int num = Integer.parseInt("123");
		System.out.println("10 진수 : " + num);
		num = Integer.parseInt("123", 8);
		System.out.println("8진수 : 123 => 10진수 : " + num);
		num = Integer.parseInt("123", 16);
		System.out.println("16진수 : 123 => 10진수 : " + num);
		
		// 10 진수를 2진수, 8진수 16진수러 변환
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(83));
		System.out.println(Integer.toHexString(291));
		
		// 실수 문자열
		float f = Float.parseFloat("123.45");
		System.out.println(f + 10);
		
		double d = Double.parseDouble("123.456");
		System.out.println(d + 10);
	}

}
