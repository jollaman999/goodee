package chap4;

import java.util.Scanner;

/*
 * 1~100 숫자 맞추기
 */

public class Exam7 {

	public static void main(String[] args) {
		int i = 0;
		int num = (int) (Math.random() * 100) + 1;
		// System.out.println(num);
		
		while(true) {			
			System.out.println("1에서 100사이의 수를 입력하세요");
			
			Scanner scan = new Scanner(System.in);
			int input_num = scan.nextInt();
			
			i++;
			
			if (input_num < num) {
				System.out.println("더 큰 수를 입력하세요");
			} else if (input_num > num) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("정답입니다!");
				System.out.println("시도 횟수 : " + i);
				break;
			}
		}
		
	}

}
