package chap6;

class Circle2 {
	int x, y, no;
	int r;
	static int count;
	
	Circle2() {
		this(1, 1, 1);
	}
	
	Circle2(int r) {
		this(r, 1, 1);
	}
	
	Circle2(int r, int x, int y) {
		this.x = x;
		this.y = y;
		this.r = r;
		no = ++count;
	}
	
	double area() {
		return Math.PI * r * r;
	}
	
	double length() {
		return 2 * Math.PI * r;
	}
	
	public String toString() {
		return no + "번원=> 반지름 : " + r + ", (" + x + ", " + y + ")"
				+ ", 넓이 :" + String.format("%.2f", area())
				+ ", 둘레 : "+ String.format("%.2f", length()); 
	}
}

public class Test2 {

	public static void main(String[] args) {
		Circle2 c1 = new Circle2();
		Circle2 c2 = new Circle2(50);
		Circle2 c3 = new Circle2(100, 10, 20);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
