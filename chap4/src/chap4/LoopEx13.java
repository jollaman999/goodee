package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڸ� �Է¹޾� ������ �ڸ����� �� ���ϱ� (���ڿ��� ���� �ʱ�)
 * 
 * 123
 * 6
 * 
 * 1357
 * 16
 */

public class LoopEx13 {

	public static void main(String[] args) {
		int input;
		int sum = 0;
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		while (input != 0) {
			sum += input % 10;
			input /= 10;
		}
	
		System.out.println(sum);
	}

}
