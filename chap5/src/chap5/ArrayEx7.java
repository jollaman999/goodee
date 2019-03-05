package chap5;

import java.util.Scanner;

/*
 * 10�� �ڿ����� 16������ �����ض�
 * 
 * 10
 * A
 * 
 * 255
 * FF
 */

public class ArrayEx7 {

	public static void main(String[] args) {
		int num = 0;
		int divnum;
		int index = 0;
		
		System.out.print("16������ ������ 10���� �Է� : ");
		Scanner scan =  new Scanner(System.in);
		num = scan.nextInt();
		
		divnum = num;
		
		char c[] = new char[32];
		
		while (divnum != 0) {
			if (divnum % 16 >= 10) {
				c[index++] = (char) ('A' + divnum % 16 - 10);
			} else {
				c[index++] = (char) ('0' + divnum % 16);
			}
			divnum /= 16;
		}
		
		System.out.print(num + "�� 16���� : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
	}

}
