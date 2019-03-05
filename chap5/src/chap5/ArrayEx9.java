package chap5;

import java.util.Scanner;

/*
 * 금액을 입력박아 최소개의 동전으로 바꿔주는 프로그램
 * 
 * 동전 종류 : 500, 100, 50, 10, 5, 1
 * 
 * 3600
 * 500동전 : 7개
 * 100동전 : 1개
 * ..
 */

public class ArrayEx9 {

	public static void main(String[] args) {
		int dongjeon[] = {500, 100, 50, 10, 5, 1};
		
		System.out.print("금액을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int money = scan.nextInt();
		
		for (int i : dongjeon) {
			System.out.println(i + "원 : " + money / i + "개");
			money %= i;
		}
	}

}
