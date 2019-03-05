package chap4;

import java.util.Scanner;

/*
 * 년도를 4자리로 입력받아 윤년 구하기
 * 4로 나누어 떨어지면 윤년
 *  400의 배수인 경우는 윤년
 *  100의 배수이면 평년
 * 그외는 평년
 * 
 * 2001 평년
 * 
 * 2016 윤년
 * 
 * 2100 평년
 */

public class Exam2 {

	public static void main(String[] args) {
		System.out.print("년도를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				System.out.println("평년입니다.");
			} else if (year % 400 == 0) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("윤년입니다.");
			}
		} else {
			System.out.println("평년입니다.");
		}
	}

}
