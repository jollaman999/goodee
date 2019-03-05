package chap5;

import java.util.Scanner;

/*
 * 10진수를 입력받아서, 2진수, 8진수, 10진수, 16진수로 변경하기
 * 
 * 10진수를 입력하세요
 * 10
 * 2진수 : 1010
 * 8진수 : 12
 * 10진수 : 10
 * 16진수 : A
 */

public class ArrayEx8 {

	public static void main(String[] args) {
		int num = 0;
		int divnum;
		int index;
		int digit[] = {2, 8, 10, 16};
		byte b[] = null;
		char c[] = null;
		
		System.out.print("10진수 입력 : ");
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
			
			System.out.print(i + "진수 : ");
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
