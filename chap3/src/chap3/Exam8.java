package chap3;

import java.util.Scanner;

/*
 * 10���� 90������ ���� �Է¹޾� �Է¹��� ������ ũ�ų� �����鼭, ���� ����� 10�� ����� ���Ͽ���
 * ������ 10�� ����� �Է¹��� ���� ���� ���
 * 
 * 24
 * 30 - 24 = 6
 * 
 * 20
 * 20 - 20 = 0
 */

public class Exam8 {

	public static void main(String[] args) {
		System.out.println("���� �Է� �ض�");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int baesu = num % 10 == 0 ? num : 10 * (num / 10 + 1);
		System.out.println("ũ�ų� ���� ���� ����� 10�� ��� : " + baesu);
		System.out.println("�� ���� �� : " + (baesu - num));
	}
}
