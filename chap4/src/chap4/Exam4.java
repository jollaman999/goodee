package chap4;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		int height;
		
		System.out.print("���̸� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		height = scan.nextInt();
		
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
