package chap6;

class Math4 {
	int a = 10;
//	int add(int a, int b) {
//		System.out.print("1 : ");
//		return a + b;
//	}
//	long add(long a, int b) {
//		System.out.print("2 : ");
//		return a + b;
//	}
	long add(int a, long b) {
		System.out.print("3 : ");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("4 : ");
		return a + b;
	}
}

public class OverloadingEx2 {

	public static void main(String[] args) {
		Math4 m = new Math4();
		System.out.println(m.add(10, 10));
		System.out.println(m.add(10, 10L));
		System.out.println(m.add(10L, 10));
		System.out.println(m.add(10L, 10L));
	}

}
