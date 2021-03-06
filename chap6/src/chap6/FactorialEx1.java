package chap6;

/*
 * 재귀함수 예제 : 자기 함수 호출
 */

public class FactorialEx1 {

	public static void main(String[] args) {
		System.out.println(new FactorialEx1().factorial(4));
	}

	private int factorial(int i) {
		return (i == 1) ? 1 : i * factorial(i - 1);
	}

}
