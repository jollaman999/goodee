package chap8;

class Single {
	private static Single s = new Single();
	private Single() {}
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public static Single getInstance() {
		return s;
	}
}

public class PackageEx2 {

	public static void main(String[] args) {
		// Math m = new Math();
		// Single s1 = new Single();
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		Single s3 = Single.getInstance();
		System.out.println(s1.getValue() + ", " + s2.getValue() + ", " + s3.getValue());
		s1.setValue(100);
		System.out.println(s1.getValue() + ", " + s2.getValue() + ", " + s3.getValue());
	}

}
