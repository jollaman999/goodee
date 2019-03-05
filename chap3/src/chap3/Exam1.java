package chap3;

import java.util.Scanner;

// 12345 초가 몇시 몇분 몇초인지 출력하기

public class Exam1 {

	public static void main(String[] args) {
		int num;
		
		System.out.print("계산할 초를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		int h = num / 3600;
		int m = num % 3600 / 60;
		int s = num % 60;
		
		System.out.println(num + "초는 " + h + "시간 " + m + "분 " + s + "초 입니다");
	}
}
