package chap3;

public class Exam {

	public static void main(String[] args) {
		System.out.println(3<<2);
		
		int a = 10, b = 20;
		int c;
		
		c = ++a + ++b;
		System.out.println("1.a=" + a + "\tb=" + b + "\tc=" + c);
		
		c = a++ + b++;
		System.out.println("2.a=" + a + "\tb=" + b + "\tc=" + c);
		
		c = a++ + ++b;
		System.out.println("3.a=" + a + "\tb=" + b + "\tc=" + c);
		
		c = ++a + b++;
		System.out.println("4.a=" + a + "\tb=" + b + "\tc=" + c);
		
		c = --a + --b;
		System.out.println("5.a=" + a + "\tb=" + b + "\tc=" + c);
		
		c = a-- + b--;
		System.out.println("6.a=" + a + "\tb=" + b + "\tc=" + c);
		
		c = a-- + --b;
		System.out.println("7.a=" + a + "\tb=" + b + "\tc=" + c);
		
		c = --a + b--;
		System.out.println("8.a=" + a + "\tb=" + b + "\tc=" + c);
		
		System.out.println();
		
		byte a1 = 10;
		byte b1 = 20;
		byte c1 = (byte)(a1 + b1);
		char ch1= 'A';
		ch1 = (char)(ch1 + 2);
		float f1 = 3.0f / 2;
		long l = 3000 * 3000 * 3000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d == f2;
		System.out.println("c=" + c);
		System.out.println("ch=" + ch1);
		System.out.println("f=" + f1);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
		
		System.out.printf("float : %.200f\n double : %.200f", 0.1f, 0.1);
	}

}

