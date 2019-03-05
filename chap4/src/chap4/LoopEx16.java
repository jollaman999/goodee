package chap4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 회문수 판단 프로그램 (앞으로 해도 거꾸로 해도 같은 숫자)
 */

public class LoopEx16 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input;
		
		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("입력 범위 초과!");
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
			System.out.println("회문수 입니다");
		} else {
			System.out.println("회문수가 아닙니다");
		}
	}

}

