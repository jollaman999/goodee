package chap3;

import java.util.Scanner;

/*
 * 문자를 입력받아서 소문자인 경우 대문자로 변경하여 출려하기
 * 영문자 아닌 경우 소문자 아님 출력하기
 */

public class Exam6 {
	public static void main(String args[]) {
		System.out.print("문자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
	
		String input = scan.next();
		
		if (input.length() != 1) {
			System.out.println("한문자만 입력하세요");
			return;
		}
		
		char c = input.charAt(0);
		System.out.println(c >= 'a' ? c <= 'z' ? c -= 32 : "소문자 아님" : "소문자 아님");
	}
}
