package chap5;

import java.util.Scanner;

/*
 * �ݾ��� �Է¹ھ� �ּҰ��� �������� �ٲ��ִ� ���α׷�
 * 
 * ���� ���� : 500, 100, 50, 10, 5, 1
 * 
 * 3600
 * 500���� : 7��
 * 100���� : 1��
 * ..
 */

public class ArrayEx9 {

	public static void main(String[] args) {
		int dongjeon[] = {500, 100, 50, 10, 5, 1};
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		
		int money = scan.nextInt();
		
		for (int i : dongjeon) {
			System.out.println(i + "�� : " + money / i + "��");
			money %= i;
		}
	}

}
