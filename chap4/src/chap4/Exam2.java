package chap4;

import java.util.Scanner;

/*
 * �⵵�� 4�ڸ��� �Է¹޾� ���� ���ϱ�
 * 4�� ������ �������� ����
 *  400�� ����� ���� ����
 *  100�� ����̸� ���
 * �׿ܴ� ���
 * 
 * 2001 ���
 * 
 * 2016 ����
 * 
 * 2100 ���
 */

public class Exam2 {

	public static void main(String[] args) {
		System.out.print("�⵵�� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				System.out.println("����Դϴ�.");
			} else if (year % 400 == 0) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		} else {
			System.out.println("����Դϴ�.");
		}
	}

}
