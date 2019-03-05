package chap5;

import java.util.Scanner;

public class Homrwork_Plus {

	public static void main(String[] args) {
		String subjects[] = {"국어", "영어", "수학",
							 "물리", "화학", "사회", "컴퓨터"};
		int score[] = new int[subjects.length + 3]; // + max, min, avg
		/*
		 * max : score[subjects.length]
		 * min : score[subjects.length + 1]
		 * avg : score[subjects.length + 2]
		 */
		String star_graqph[][] = new String[10 + 1][1 + subjects.length + 3];
		int sum = 0;
		
		for (String s : subjects) {
			System.out.print(s + " ");
		}
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			boolean input_error = false;
			
			System.out.print("\n각 점수를 위 순서대로 입력해 주세요 : ");
			
			for (int i = 0; i < subjects.length; i++) {
				score[i] = scan.nextInt();
				if (score[i] < 0 || score[i] > 100) {
					input_error = true;
				}
			}
			
			if (input_error) {
				System.out.println("점수를 0점 이상 100점 이하로 입력해 주세요!");
			} else {
				break;
			}
		}
		
		score[subjects.length] = score[0]; // max
		score[subjects.length + 1] = score[0]; // min
		
		for (int i = 0; i < subjects.length; i++) {
			if (score[i] > score[subjects.length]) { // max
				score[subjects.length] = score[i];
			}
			if (score[i] < score[subjects.length + 1]) { // min
				score[subjects.length + 1] = score[i];
			}
			sum += score[i];
		}
		score[subjects.length + 2] = sum / subjects.length; // avg
		
		// 문자열 배열 공백으로 초기화
		for (int i = 0; i < star_graqph.length; i++) {
			for (int j = 0; j < star_graqph[i].length; j++) {
				star_graqph[i][j] = " ";
			}
		}
		
		// 그래프 제일 왼쪽의 점수들
		for (int i = 10; i >= 1; i--) {
			String plus = "";
			
			if (i * 10 != 100) {
				plus = " ";
			}
			star_graqph[10 - i][0] = Integer.toString(i * 10) + plus;
		}
		
		// 그래프 제일 하단의 알파벳들
		char c = 'A';
		for (int i = 1; i <= subjects.length + 3; i++) {
			star_graqph[10][i] = Character.toString(c++);
		}
		
		// 별 그리기
		for (int j = 1; j < score.length + 1; j++) {
			if (score[j - 1] % 10 == 0) {
				for (int i = (100 - score[j - 1]) / 10; i < 10; i++) {
					star_graqph[i][j] = "*";
				}
			} else {
				for (int i = (100 - score[j - 1]) / 10 + 1; i < 10; i++) {
					star_graqph[i][j] = "*";
				}
			}
		}
		
		// 다 출력
		System.out.println();
		System.out.println("TOT : " + sum);
		System.out.println("MAX : " + score[subjects.length]);
		System.out.println("MIN : " + score[subjects.length + 1]);
		System.out.println("AVG : " + score[subjects.length + 2]);
		System.out.println();
		
		for (int i = 0; i < star_graqph.length; i++) {
			for (int j = 0; j < star_graqph[i].length; j++) {
				if (j == 0 && i == star_graqph.length - 1) {
					System.out.print(star_graqph[i][j] + "   ");
				} else {
					System.out.print(star_graqph[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("A:국어, B:영어, C:수학, D:물리, E:화학,F:사회, G:컴퓨터, H:최대점수, I:최소점수, J:평균");
	}

}
