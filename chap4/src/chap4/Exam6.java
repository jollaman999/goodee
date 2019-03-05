package chap4;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		int height;
		
		System.out.print("높이를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		height = scan.nextInt();
		
		for(int i = height; i > 0; i--) {
			/*
			for(int j = i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= height - i + 1; j++) {
				System.out.print("*");
			}
			*/
			
			for(int j = 1; j <= height; j++) {
				if (j <= height - i)
					System.out.print(" ");
				else
					System.out.print("*");
			}

			System.out.println();
		}
	}

}
