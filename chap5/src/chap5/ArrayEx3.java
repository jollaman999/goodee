package chap5;

import java.util.Scanner;

/*
 * ȭ�鿡�� 1���� 10������ ���� 10�� �Է¹޾Ƽ� �Է¹��� �� ��ŭ * ���
 * 
 * 1 2 3 4 5 6 7 8 9 10
 * 
 * 1 : *
 * 2 : **
 * 3 : ***
 */

public class ArrayEx3 {

	public static void main(String[] args) {
		int input[] = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 10) {
				System.out.print(" ");
			}
			System.out.print(input[i] + " : ");
			for (int j = 0; j < input[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
