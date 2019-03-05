package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자로 이루어진 문자를 입력받아 각각의 자리수의 합 구하기
 * 
 * 12345
 * 15
 * 
 * 123*456
 * 숫자아님
 */

public class LoopEx12 {

	public static void main(String[] args) {
		String input;
		int sum = 0;
		boolean num_ok = true;
		
		System.out.print("숫자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		input = scan.next();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				System.out.println("숫자아님");
				num_ok = false;
				break;
			}
			sum += input.charAt(i) % '0';
		}
		
		if (num_ok) {
			System.out.println("자릿수 합계 : " + sum);
		}
	}

}
