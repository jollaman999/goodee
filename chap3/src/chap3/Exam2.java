package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� 2�ڸ� ������ �Է¹޾� 100�ڸ� �̸��� ������ ����ϱ�
 * [��]
 * ���ڸ� ������ �Է��ϼ���
 * 321
 * 300
 * 
 * [��]
 * ���ڸ� ������ �Է��ϼ���
 * 100
 * 100
 * 
 * [��]
 * ���ڸ� ������ �Է��ϼ���
 * 199
 * 100
 * 
 */

public class Exam2 {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("���ڸ� ������ �Է��ϼ��� (0 �Է½� ����)");
			
			int num = 0;
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
			
			System.out.println(num - num % 100);
		}
	}

}
