package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڸ� 99999 ���� �ɶ� ���� �Է¹޾�
 * �׵��� �Էµ� ������ �հ� ����� ���ض�
 */

public class LoopEx14 {

	public static void main(String[] args) {
		int input = 0;
		int i = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			input  = scan.nextInt();
			if (input == 99999) {
				break;
			}
			sum += input;
			i++;
		}

		System.out.println("�׵��� �Էµ� ������ ���� : " + sum);
		System.out.println("�׵��� �Էµ� ������ ���� : " + i);
		System.out.println("�׵��� �Էµ� ������ ��� : " + sum / i);
	}

}
