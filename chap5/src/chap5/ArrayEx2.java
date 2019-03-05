package chap5;

import java.util.Scanner;

/*
 * 화면에서 점수를 10 입력 받아서 score 배열 저장하고, 점수의 합께와 평균, 최대 점수를 출력하기
 */

public class ArrayEx2 {

	public static void main(String[] args) {
		int score[] = new int[10];
		int sum= 0;
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 점수를 입력하시오 : ");
			score[i] = scan.nextInt();
			sum += score[i];
			if (score[i] > max) {
				max = score[i];
			}
		}

		System.out.println("합계 : " + sum
				+ ", 평균 : " + (double) sum/score.length
				+ ", 최대 점수 : " + max);
	}

}
