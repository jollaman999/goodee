package chap7;

abstract class Shape {
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area();
	abstract double length();
}

class Circle extends Shape {
	int r;
	
	Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override
	double area() {
		return Math.PI * r * r;
	}

	@Override
	double length() {
		return Math.PI * r * 2;
	}
}

class Rectangle extends Shape {
	int width;
	int height;
	
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return 2 * (width + height);
	}
}

public class ShapeEx1 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(10, 10);
		for (Shape s : shapes) {
			System.out.println(s.type + "의 넓이 : " + s.area() + ", 둘레 : " + s.length());
		}
	}

}
