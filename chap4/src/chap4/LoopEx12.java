package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڷ� �̷���� ���ڸ� �Է¹޾� ������ �ڸ����� �� ���ϱ�
 * 
 * 12345
 * 15
 * 
 * 123*456
 * ���ھƴ�
 */

public class LoopEx12 {

	public static void main(String[] args) {
		String input;
		int sum = 0;
		boolean num_ok = true;
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		input = scan.next();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				System.out.println("���ھƴ�");
				num_ok = false;
				break;
			}
			sum += input.charAt(i) % '0';
		}
		
		if (num_ok) {
			System.out.println("�ڸ��� �հ� : " + sum);
		}
	}

}
