package chap4;

import java.util.Scanner;

/*
 * �Ѱ��� ���ڸ� �Է¹޾Ƽ� �빮������, �ҹ�������, ��������, ��Ÿ �������� ����ϱ�
 */

public class Exam1 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		if (input.length() != 1) {
			System.out.println("���� : ���� �ϳ��� �Է��Ͻʽÿ�!");
			return;
		}
		
		char c = input.charAt(0);
		if (c >= 'a' && c <= 'z') {
			System.out.println("�ҹ��� �Դϴ�.");
		} else if (c >= 'A' && c <= 'Z') {
			System.out.println("�빮�� �Դϴ�");
		} else if (c >= '0' && c <= '9') {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("��Ÿ �����Դϴ�");
		}
	}

}
