package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자를 입력받아 각각의 자리수의 합 구하기 (문자열로 하지 않기)
 * 
 * 123
 * 6
 * 
 * 1357
 * 16
 */

public class LoopEx13 {

	public static void main(String[] args) {
		int input;
		int sum = 0;
		
		System.out.print("숫자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		while (input != 0) {
			sum += input % 10;
			input /= 10;
		}
	
		System.out.println(sum);
	}

}
