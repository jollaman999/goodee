package chap4;

import java.util.Scanner;

/*
 * if ���� ����
 * 
 * if (���ǽ�) {
 * 	����1 <-- ���ǽ��� ����� ���� ��� ����Ǵ� �κ�
 * } else if (���ǽ�) {
 * 	����2 <-- ���ǽ��� ����� ���� ��� ����Ǵ� �κ�
 * } else {
 * 	����3 <-- ��� ���ǹ��� ������ ��� ����Ǵ� �κ�
 * }
 * 
 * �����ؾ� �Ǵ� ���� �Ѱ��� ��� {} ���� �ص� �ȴ�.
 */

public class IfEx1 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String grade;
		
		int score = scan.nextInt();
		
		if (score >= 60) {
			System.out.println("�հ��� �����մϴ�.");
			System.out.println("�ڰ��� ã�ư�����!");
		} else {
			System.out.println("���հ� �Դϴ�");
		}
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("����� ����� " + grade + "�Դϴ�.");
	}

}
