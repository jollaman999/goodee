package chap3;

import java.util.Scanner;

// 12345 �ʰ� ��� ��� �������� ����ϱ�

public class Exam1 {

	public static void main(String[] args) {
		int num;
		
		System.out.print("����� �ʸ� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		int h = num / 3600;
		int m = num % 3600 / 60;
		int s = num % 60;
		
		System.out.println(num + "�ʴ� " + h + "�ð� " + m + "�� " + s + "�� �Դϴ�");
	}
}
