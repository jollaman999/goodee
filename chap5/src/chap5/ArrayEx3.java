package chap5;

import java.util.Scanner;

/*
 * 화면에서 1부터 10까지의 수를 10개 입력받아서 입력받은 수 만큼 * 출력
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
