package chap4;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		int height;
		
		System.out.print("높이를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		height = scan.nextInt();
		
		for(int i = height; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
