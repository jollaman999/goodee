package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수면 양수 음수면 음수 0이면 0 출력
 */

public class Exam5 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String result = num > 0 ? "양수" : num == 0 ? "0" : "음수";
		System.out.println(result);
	}
}
