package chap10.home;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputNumberException extends Exception {
	InputNumberException(String msg) {
		super(msg);
	}
}

public class Test3 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1; // 1~100
		int input = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			try {
				input = scan.nextInt();
				if (input < 1 || input > 100) {
					throw new InputNumberException("���� �Է� ���� �ʰ�!");
				}
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���!");
				continue;
			} catch (InputNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			count++;
			
			if (answer > input) {
				System.out.println("�� ū �� �� �Է��ϼ���!");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���!");
			} else {
				System.out.println("������ϴ�!");
				System.out.println("�õ� Ƚ���� " + count + "�� �Դϴ�.");
				break;
			}
		} while(true);
		
		scan.close();
	}

}
