package chap3;

import java.util.Scanner;

public class OpEx8 {

	public static void main(String[] args) {
		System.out.println("���� �ΰ��� �Է��ϼ���");
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int result = (num1 > num2) ? num1 : num2;
		System.out.println("�Էµ� �� ���� �� ū �� : " + result);
		System.out.println("�Էµ� �� ���� �� ū �� : "
				+ ((num1 > num2) ? num1 : (num1 < num2) ? num2 : "�� ���� ����"));
	}
}
