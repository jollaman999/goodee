package chap4;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num > 0) {
			System.out.println("양수 입니다");
		} else if (num < 0) {
			System.out.println("음수 입니다");
		} else {
			System.out.println("0 입니다");
		}
	}

}
