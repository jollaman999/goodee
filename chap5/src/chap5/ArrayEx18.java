package chap5;

import java.util.Scanner;

public class ArrayEx18 {

	public static void main(String[] args) {
		int input = 0;
		int num = 1;

		System.out.println("정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();

		if (input % 2 == 0) {
			System.out.println("에러 : 홀수를 입력하세요!");
			return;
		}

		int[][] star = new int[input][input];

		for (int i = star.length - 1; i >= 0; i--) {
			if (i > star.length / 2) {
				for (int j = i; j >= star[i].length - i - 1; j--) {
					star[i][j] = num;
					num++;
				}
			} else {
				for (int j = star[i].length - i - 1; j >= i; j--) {
					star[i][j] = num;
					num++;
				}
			}
		}

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				if (star[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(star[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
