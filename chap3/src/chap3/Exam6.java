package chap3;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� �ҹ����� ��� �빮�ڷ� �����Ͽ� ����ϱ�
 * ������ �ƴ� ��� �ҹ��� �ƴ� ����ϱ�
 */

public class Exam6 {
	public static void main(String args[]) {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
	
		String input = scan.next();
		
		if (input.length() != 1) {
			System.out.println("�ѹ��ڸ� �Է��ϼ���");
			return;
		}
		
		char c = input.charAt(0);
		System.out.println(c >= 'a' ? c <= 'z' ? c -= 32 : "�ҹ��� �ƴ�" : "�ҹ��� �ƴ�");
	}
}
