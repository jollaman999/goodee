package chap3;

import java.util.Scanner;

/*
 * 화면에서 2자리 정수를 입력받아 100자리 미만을 버리고 출력하기
 * [예]
 * 세자리 정수를 입력하세요
 * 321
 * 300
 * 
 * [예]
 * 세자리 정수를 입력하세요
 * 100
 * 100
 * 
 * [예]
 * 세자리 정수를 입력하세요
 * 199
 * 100
 * 
 */

public class Exam2 {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("세자리 정수를 입력하세요 (0 입력시 종료)");
			
			int num = 0;
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
			
			System.out.println(num - num % 100);
		}
	}

}
