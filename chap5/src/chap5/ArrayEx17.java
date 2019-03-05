package chap5;

import java.util.Scanner;

/*
 * 홀수대의 배열의 크기를 입력받아 matrix(2차원 배열)를 생성하고 문자를 이용하여 모래시계 출력하기
 */

public class ArrayEx17 {

	public static void main(String[] args) {
		int input = 0;
		
		System.out.println("정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("에러 : 홀수를 입력하세요!");
			return;
		}
		
		char[][] star = new char[input][input];
		
		for (int i = 0; i < star.length; i++) {
			if (i <= star.length / 2) {
				for (int j = i; j <= star[i].length - i - 1; j++) {
					star[i][j] = '*';
				}
			} else {
				for (int j = star[i].length - i - 1; j <= i; j++) {
					star[i][j] = '*';
				}
			}
		}
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
	}

}
