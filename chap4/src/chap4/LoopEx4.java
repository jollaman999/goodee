package chap4;

/*
 * 중첩 반복문 : 구구단
 */

public class LoopEx4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i == 1) {
					System.out.print(j + "단" + "\t\t");
				} else {
					System.out.print(j + " x " + i + " = " + i * j + "\t");
				}
			}
			System.out.println();
		}
	}

}
