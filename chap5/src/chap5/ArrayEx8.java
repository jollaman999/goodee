package chap5;

import java.util.Scanner;

/*
 * 10������ �Է¹޾Ƽ�, 2����, 8����, 10����, 16������ �����ϱ�
 * 
 * 10������ �Է��ϼ���
 * 10
 * 2���� : 1010
 * 8���� : 12
 * 10���� : 10
 * 16���� : A
 */

public class ArrayEx8 {

	public static void main(String[] args) {
		int num = 0;
		int divnum;
		int index;
		int digit[] = {2, 8, 10, 16};
		byte b[] = null;
		char c[] = null;
		
		System.out.print("10���� �Է� : ");
		Scanner scan =  new Scanner(System.in);
		num = scan.nextInt();
		
		for (int i : digit) {
			if (i == 16) {
				c = new char[32];
			} else {
				b = new byte[32];
			}
			index = 0;
			divnum = num;
			
			while (divnum != 0) {
				if (i == 16) {
					if (divnum % i >= 10) {
						c[index++] = (char) ('A' + divnum % i - 10);
					} else {
						c[index++] = (char) ('0' + divnum % i);
					}
				} else {
					b[index++] = (byte) (divnum % i);
				}
				divnum /= i;
			}
			
			System.out.print(i + "���� : ");
			for (int j = index - 1; j >= 0; j--) {
				if (i == 16) {
					System.out.print(c[j]);
				} else {
					System.out.print(b[j]);
				}
			}
			System.out.println();
		}
	}

}
