package chap5;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int height = 0;
		int i, j;
		
		System.out.print("�ﰢ�� ���̸� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		height = scan.nextInt();
		
		for (i = 0; i < height; i++) {
			for (j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		int len = scan.nextInt();
		int max = len * 2 - 1;  //�عٴ� * ����   5
		for(int i=0;i<len;i++) {
			for(int j=0;j<max;j++) { 
				if(j>= (max/2-i) && j <= (max/2+i)) {
					System.out.print("*");
				} else if (j < (max/2-i) || j > (max/2+i)) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		 */

	}

}
