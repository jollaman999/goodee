package chap3;

import java.util.Scanner;

/*
 * 화면에서 점수를 입력받아서 90점 이상이면 A 80점 이상이면 B 70 점 이상이면 C
 * 60점 이상이면 D 60점 미만이면 F
 */

public class Exam9 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		System.out.println("당신의 등급은 "
					+ (score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F")
					+ "입니다.");
	}

}
