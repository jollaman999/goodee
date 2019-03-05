package chap4;

import java.util.Scanner;

/*
 * 한개의 문자를 입력받아서 대문자인지, 소문자인지, 숫자인지, 기타 문자인지 출력하기
 */

public class Exam1 {

	public static void main(String[] args) {
		System.out.print("문자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		if (input.length() != 1) {
			System.out.println("에러 : 문자 하나만 입력하십시오!");
			return;
		}
		
		char c = input.charAt(0);
		if (c >= 'a' && c <= 'z') {
			System.out.println("소문자 입니다.");
		} else if (c >= 'A' && c <= 'Z') {
			System.out.println("대문자 입니다");
		} else if (c >= '0' && c <= '9') {
			System.out.println("숫자입니다");
		} else {
			System.out.println("기타 문자입니다");
		}
	}

}
