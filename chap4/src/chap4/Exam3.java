package chap4;

import java.util.Scanner;

/*
 * ������ �Է¹޾Ƽ� 60�� �̻��̸� �հ��� ����ϰ� �ƴϸ� ���հ� ���
 * �ݵ�� switch ��������
 */

public class Exam3 {

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�");
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch (score / 10) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("�հ�");
			break;
		default:
			System.out.println("���հ�");
			break;
		}
	}

}
