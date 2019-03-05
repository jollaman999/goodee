package chap6;

/*
 * 반올림 하기
 * 3.14 <= (int) ((3.141592... + 0.05) * 100) / 100.0
 */

class Circle {
	int r;
	int x, y;
	int no;
	static int count;
	double area() {
		return Math.PI * r * r;
	}
	double length() {
		return 2 * Math.PI * r;
	}
	@Override
	public String toString() { // 메서드의 재정의
		return no + "번째 원  - x좌표 : " + x + ", y좌표 : " + y
					+ ", 반지름 : " + r + ", 넓이 : " + String.format("%.2f", area())
					+ ", 지름 : " + String.format("%.2f", length());
	}
}

public class CircleEx {

	public static void main(String[] args) {
		Circle circle[] = new Circle[3];
		
		for (int i = 0; i < circle.length; i++) {
			circle[i] = new Circle();
		}
		
		circle[0].r = 3;
		circle[0].x = 2;
		circle[0].y = 6;
		circle[0].no = ++Circle.count;
		
		circle[1].r = 5;
		circle[1].x = 8;
		circle[1].y = 7;
		circle[1].no = ++Circle.count;
		
		circle[2].r = 3;
		circle[2].x = 9;
		circle[2].y = 10;
		circle[2].no = ++Circle.count;
		
		for (Circle c : circle) {
			System.out.println(c);
		}
	}

}
