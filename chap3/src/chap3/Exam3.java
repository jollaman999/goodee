package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� 2�ڸ� ������ �Է¹޾� 100�ڸ� �̸��� ������ ����ϱ�
 * [��]
 * ���ڸ� ������ �Է��ϼ���
 * 321
 * 301
 * 
 * [��]
 * ���ڸ� ������ �Է��ϼ���
 * 100
 * 101
 * 
 * [��]
 * ���ڸ� ������ �Է��ϼ���
 * 199
 * 101
 * 
 */

public class Exam3 {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("���ڸ� ������ �Է��ϼ��� (0 �Է½� ����)");
			
			int num = 0;
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			if (num < -999 || num > 999) {
				System.out.println("���� : 3�ڸ� ������ �ƴմϴ�!");
				continue;
			} else if (num == 0) {
				break;
			}
			
			if (num > 0) {
				System.out.println(num - num % 100 + 1);
			} else {
				System.out.println(num - num % 100 - 1);
			}
		}
	}

}
