package chap4;

import java.util.Scanner;

/*
 * 1~100 ���� ���߱�
 */

public class Exam7 {

	public static void main(String[] args) {
		int i = 0;
		int num = (int) (Math.random() * 100) + 1;
		// System.out.println(num);
		
		while(true) {			
			System.out.println("1���� 100������ ���� �Է��ϼ���");
			
			Scanner scan = new Scanner(System.in);
			int input_num = scan.nextInt();
			
			i++;
			
			if (input_num < num) {
				System.out.println("�� ū ���� �Է��ϼ���");
			} else if (input_num > num) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("�����Դϴ�!");
				System.out.println("�õ� Ƚ�� : " + i);
				break;
			}
		}
		
	}

}
