package chap5;

import java.util.Scanner;

/*
 * Ȧ������ �迭�� ũ�⸦ �Է¹޾� matrix(2���� �迭)�� �����ϰ� ���ڸ� �̿��Ͽ� �𷡽ð� ����ϱ�
 */

public class ArrayEx17 {

	public static void main(String[] args) {
		int input = 0;
		
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("���� : Ȧ���� �Է��ϼ���!");
			return;
		}
		
		char[][] star = new char[input][input];
		
		for (int i = 0; i < star.length; i++) {
			if (i <= star.length / 2) {
				for (int j = i; j <= star[i].length - i - 1; j++) {
					star[i][j] = '*';
				}
			} else {
				for (int j = star[i].length - i - 1; j <= i; j++) {
					star[i][j] = '*';
				}
			}
		}
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
	}

}
