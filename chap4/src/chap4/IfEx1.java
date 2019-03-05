package chap4;

import java.util.Scanner;

/*
 * if 구문 예제
 * 
 * if (조건식) {
 * 	문장1 <-- 조건식의 결과가 참인 경우 실행되는 부분
 * } else if (조건식) {
 * 	문장2 <-- 조건식의 결과가 참인 경우 실행되는 부분
 * } else {
 * 	문장3 <-- 모든 조건문이 거짓인 경우 실행되는 부분
 * }
 * 
 * 실행해야 되는 문장 한개인 경우 {} 생략 해도 된다.
 */

public class IfEx1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String grade;
		
		int score = scan.nextInt();
		
		if (score >= 60) {
			System.out.println("합격을 축하합니다.");
			System.out.println("자격증 찾아가세요!");
		} else {
			System.out.println("불합격 입니다");
		}
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("당신의 등급은 " + grade + "입니다.");
	}

}
