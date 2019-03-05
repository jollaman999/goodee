package chap5;

import java.util.Scanner;

public class Homrwork_Plus {

	public static void main(String[] args) {
		String subjects[] = {"����", "����", "����",
							 "����", "ȭ��", "��ȸ", "��ǻ��"};
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
			
			System.out.print("\n�� ������ �� ������� �Է��� �ּ��� : ");
			
			for (int i = 0; i < subjects.length; i++) {
				score[i] = scan.nextInt();
				if (score[i] < 0 || score[i] > 100) {
					input_error = true;
				}
			}
			
			if (input_error) {
				System.out.println("������ 0�� �̻� 100�� ���Ϸ� �Է��� �ּ���!");
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
		
		// ���ڿ� �迭 �������� �ʱ�ȭ
		for (int i = 0; i < star_graqph.length; i++) {
			for (int j = 0; j < star_graqph[i].length; j++) {
				star_graqph[i][j] = " ";
			}
		}
		
		// �׷��� ���� ������ ������
		for (int i = 10; i >= 1; i--) {
			String plus = "";
			
			if (i * 10 != 100) {
				plus = " ";
			}
			star_graqph[10 - i][0] = Integer.toString(i * 10) + plus;
		}
		
		// �׷��� ���� �ϴ��� ���ĺ���
		char c = 'A';
		for (int i = 1; i <= subjects.length + 3; i++) {
			star_graqph[10][i] = Character.toString(c++);
		}
		
		// �� �׸���
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
		
		// �� ���
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
		
		System.out.println("A:����, B:����, C:����, D:����, E:ȭ��,F:��ȸ, G:��ǻ��, H:�ִ�����, I:�ּ�����, J:���");
	}

}
