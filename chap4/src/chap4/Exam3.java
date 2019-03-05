package chap4;

import java.util.Scanner;

/*
 * 점수를 입력받아서 60점 이상이면 합격을 출력하고 아니면 불합격 출력
 * 반드시 switch 구문으로
 */

public class Exam3 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하시오");
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch (score / 10) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("합격");
			break;
		default:
			System.out.println("불합격");
			break;
		}
	}

}
