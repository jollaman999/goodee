package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڸ� �Է¹޾Ƽ� ¦������ Ȧ������ ����ϱ�
 */
 
public class Exam4 {

	public static void main(String[] args) {
		int num;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		String result = num % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(num + " ��(��) " + result + " �Դϴ�.");
	}
}
