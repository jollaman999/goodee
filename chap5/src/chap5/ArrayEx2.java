package chap5;

import java.util.Scanner;

/*
 * ȭ�鿡�� ������ 10 �Է� �޾Ƽ� score �迭 �����ϰ�, ������ �ղ��� ���, �ִ� ������ ����ϱ�
 */

public class ArrayEx2 {

	public static void main(String[] args) {
		int score[] = new int[10];
		int sum= 0;
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "��° ������ �Է��Ͻÿ� : ");
			score[i] = scan.nextInt();
			sum += score[i];
			if (score[i] > max) {
				max = score[i];
			}
		}

		System.out.println("�հ� : " + sum
				+ ", ��� : " + (double) sum/score.length
				+ ", �ִ� ���� : " + max);
	}

}
