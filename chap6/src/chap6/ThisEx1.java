package chap6;

class Car {
	String color;
	int number;
	
	Car (String color, int number) {
		System.out.println("Car(String c, int n) 생성자 호출");
		this.color = color;
		this.number = number;
	}
	Car (String c) {
		this(c, 1);
		System.out.println("Car(String c) 생성자 호출");
	}
	Car (int n) {
		// color = "white";
		// number = n;
		this("white", n);
		System.out.println("Car(int n) 생성자 호출");
	}
	public String toString() {
		//int number = 10;
		return this.color + " : " + this.number;
	}
}

public class ThisEx1 {

	public static void main(String[] args) {
		Car c1 = new Car("blue", 1234);
		System.out.println(c1);
		Car c2 = new Car("red");
		System.out.println(c2);
		Car c3 = new Car(5678);
		System.out.println(c3);
	}

}
