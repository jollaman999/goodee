package chap3;

import java.util.Scanner;

/*
 * 화면에서 숫자를 입력받아서 짝수인지 홀수인지 출력하기
 */
 
public class Exam4 {

	public static void main(String[] args) {
		int num;
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + " 은(는) " + result + " 입니다.");
	}
}
