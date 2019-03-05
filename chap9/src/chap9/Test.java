package chap9;

class Super {
	public float getNum() {
		return 3.0f;
	}
	
	public class Sub extends Super {
		public void getNum(double d) {
		}
	}
}

public class Test {

	public static void main(String[] args) {
		double c = 0x134f;
		System.out.println(c);
	}

}
