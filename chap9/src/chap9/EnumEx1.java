package chap9;

public class EnumEx1 {

	public enum Car {
		AVANTE, SONATA, GRANDURE, K9
	}
	
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println("Car1 : " + car);
		car = Car.SONATA;
		System.out.println("Car1 : " + car);
		car = Car.K9;
		System.out.println("Car1 : " + car);
		
		System.out.println("====================");
		
		if (car instanceof Object) {
			System.out.println(car.toString());
			System.out.println(car.getClass().getName());
		}
		Car[] cars = Car.values();
		for (Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
	}

}
