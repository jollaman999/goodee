package chap3;

import java.util.Scanner;

/*
 * 10부터 90사이의 수를 입력받아 입력받은 수보다 크거나 같으면서, 가장 가까운 10의 배수를 구하여라
 * 구해진 10의 배수와 입력받은 수의 차를 출력
 * 
 * 24
 * 30 - 24 = 6
 * 
 * 20
 * 20 - 20 = 0
 */

public class Exam8 {

	public static void main(String[] args) {
		System.out.println("수를 입력 해라");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int baesu = num % 10 == 0 ? num : 10 * (num / 10 + 1);
		System.out.println("크거나 같은 가장 가까운 10의 배수 : " + baesu);
		System.out.println("두 수의 차 : " + (baesu - num));
	}
}
