package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자를 99999 값이 될때 까지 입력받아
 * 그동안 입력된 숫자의 합과 평균을 구해라
 */

public class LoopEx14 {

	public static void main(String[] args) {
		int input = 0;
		int i = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			input  = scan.nextInt();
			if (input == 99999) {
				break;
			}
			sum += input;
			i++;
		}

		System.out.println("그동안 입력된 수들의 총합 : " + sum);
		System.out.println("그동안 입력된 수들의 갯수 : " + i);
		System.out.println("그동안 입력된 수들의 평균 : " + sum / i);
	}

}
