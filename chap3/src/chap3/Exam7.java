package chap3;

import java.util.Scanner;

/*
 * 사과를 사과 상자에 담기 위한 상자의 갯수를 출력
 * 박스에는 사과를 10개씩 담을 수 있다.
 * 
 * [예1]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 박스의 갯수 : 3
 */

public class Exam7 {

	public static void main(String[] args) {
		System.out.print("사과의 갯수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int apple_num = scan.nextInt();
		
		System.out.println("필요한 박스의 갯수 : " + (apple_num % 10 == 0 ? apple_num / 10 : apple_num / 10 + 1));
	}
}
