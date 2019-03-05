package chap11;

public class Exam3 {
	
	static String round(double input, int sosujum) {
		return String.format("%." + sosujum + "f", input);
	}

	public static void main(String[] args) {
		System.out.println(round(3.1415,1)); //3.1
		System.out.println(round(3.1415,2)); //3.14
		System.out.println(round(3.1415,3)); //3.142
		System.out.println(round(3.1415,4)); //3.1415
	}

}
