package chap4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ȸ���� �Ǵ� ���α׷� (������ �ص� �Ųٷ� �ص� ���� ����)
 */

public class LoopEx16 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int input;
		
		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("�Է� ���� �ʰ�!");
			return;
		}
		
		int result = 0;
		int temp = input;
		
		while (true) {
			result += input % 10;
			input /= 10;
			// System.out.print(input + " ");
			// System.out.println(result);
			if (input == 0) {
				break;
			}
			result *= 10;
		}
		
		if (temp == result) {
			System.out.println("ȸ���� �Դϴ�");
		} else {
			System.out.println("ȸ������ �ƴմϴ�");
		}
	}

}

