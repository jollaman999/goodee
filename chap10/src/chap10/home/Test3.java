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
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			try {
				input = scan.nextInt();
				if (input < 1 || input > 100) {
					throw new InputNumberException("숫자 입력 범위 초과!");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요!");
				continue;
			} catch (InputNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			count++;
			
			if (answer > input) {
				System.out.println("더 큰 수 를 입력하세요!");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요!");
			} else {
				System.out.println("맞췄습니다!");
				System.out.println("시도 횟수는 " + count + "번 입니다.");
				break;
			}
		} while(true);
		
		scan.close();
	}

}
