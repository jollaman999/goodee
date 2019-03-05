package chap3;

import java.util.Scanner;

public class OpEx8 {

	public static void main(String[] args) {
		System.out.println("숫자 두개를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int result = (num1 > num2) ? num1 : num2;
		System.out.println("입력된 두 수중 더 큰 수 : " + result);
		System.out.println("입력된 두 수중 더 큰 수 : "
				+ ((num1 > num2) ? num1 : (num1 < num2) ? num2 : "두 수는 같다"));
	}
}
