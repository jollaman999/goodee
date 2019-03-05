package chap5;

import java.util.Scanner;

/*
 * 10진 자연수를 16진수로 변경해라
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
		
		System.out.print("16진수로 변경할 10진수 입력 : ");
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
		
		System.out.print(num + "의 16진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
	}

}
