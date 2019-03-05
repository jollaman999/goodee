package chap4;

/*
 * 반복문 예제
 * 반복문 종류 : for, while, do..while
 */

public class LoopEx1 {

	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		int i = 1;
		while (i <= 5) {
			System.out.print(i);
			i++;
		}
		System.out.println(i);
		
		int j = 1;
		do {
			System.out.print(j);
			j++;
		} while (j <= 5);
		System.out.println();
		
		while (true) {}
	}

}
