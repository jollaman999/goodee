package chap3;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� ����� ��� ������ ���� 0�̸� 0 ���
 */

public class Exam5 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��Ͻÿ�");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String result = num > 0 ? "���" : num == 0 ? "0" : "����";
		System.out.println(result);
	}
}
