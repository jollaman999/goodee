package chap5;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = 0, kind = 0;
		char star[][] = null;
		
		while (true) {
			System.out.print("�ﰢ���� ���̸� �Է��ϼ��� : ");
			height = scan.nextInt();
			if (height > 0 && height <= 100) {
				break;
			} else {
				System.out.println("���� : 100������ �ڿ����� �Է��ϼ���!");
			}
		}
		
		while (true) {
			System.out.print("�ﰢ���� ������ �Է��ϼ��� : ");
			kind = scan.nextInt();
			if (kind >= 1 && kind <= 3) {
				break;
			} else {
				System.out.println("���� : �ﰢ���� ������ 3���� �Դϴ� 1~3������ ���� �Է��ϼ���!");
			}
		}
		
		switch(kind) {
		case 1:
			star = new char[height][height];
			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= i; j++) {
					star[i][j] = '*';
				}
			}
			break;
		case 2:
			star = new char[height][height];
			for (int i = 0; i < height; i++) {
				for (int j = height - 1 - i; j >= 0; j--) {
					star[i][j] = '*';
				}
			}
			break;
		case 3:
			star = new char[height][height * 2 - 1];
			for (int i = 0; i < height; i++) {
				for (int j = height - 1 - i; j <= height - 1 + i; j++) {
					star[i][j] = '*';
				}
			}
			break;
		default:
			break;
		}
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
	}
}
