package chap11;

public class MathEx1 {

	public static void main(String[] args) {
		// 삼각함수
		System.out.println("Math.sin(Math.PI/2) : " + Math.sin(Math.PI/2));
		System.out.println("Math.cos(60) : " + Math.cos(Math.toRadians(60)));
		System.out.println("Math.tan(Math.PI/4) : " + Math.tan(Math.PI/4));
		System.out.println("Math.toDegrees(Math.PI/4) : " + Math.toDegrees(Math.PI/4));
		
		// 제곱, 제곱근
		System.out.println("Math.sqrt(25) : " + Math.sqrt(25));
		System.out.println("Math.pow(5, 3) : " + Math.pow(5, 3));
		
		// 근사 정수
		System.out.println("Math.ceil(3.4) : " + Math.ceil(3.4)); // 보다 큰 근사 정수
		System.out.println("Math.ceil(-3.4) : " + Math.ceil(-3.4));
		System.out.println("Math.floor(3.4) : " + Math.floor(3.4)); // 보다 작은 근사 정수
		System.out.println("Math.floor(-3.4) : " + Math.floor(-3.4));
		System.out.println("Math.rint(3.4) : " + Math.rint(3.4)); // 근사 정수
		System.out.println("Math.rint(-3.4) : " + Math.rint(-3.4));
		
		// 반올림
		System.out.println("Math.round(3.7) : " + Math.round(3.7));
		System.out.println("Math.round(-3.7) : " + Math.round(-3.7));
		
		// 절대값
		System.out.println("Math.abs(-3.4) : " + Math.abs(-3.4));
		
		// 큰값, 작은값
		System.out.println("Math.max(3, 4) : " + Math.max(3, 4));
		System.out.println("Math.min(3, 4) : " + Math.min(3, 4));
		
		// 임의의 수
		System.out.println("Math.random() : " + Math.random());
	}

}
