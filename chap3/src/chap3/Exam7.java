package chap3;

import java.util.Scanner;

/*
 * ����� ��� ���ڿ� ��� ���� ������ ������ ���
 * �ڽ����� ����� 10���� ���� �� �ִ�.
 * 
 * [��1]
 * ����� ������ �Է��ϼ���
 * 22
 * �ʿ��� �ڽ��� ���� : 3
 */

public class Exam7 {

	public static void main(String[] args) {
		System.out.print("����� ������ �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int apple_num = scan.nextInt();
		
		System.out.println("�ʿ��� �ڽ��� ���� : " + (apple_num % 10 == 0 ? apple_num / 10 : apple_num / 10 + 1));
	}
}
