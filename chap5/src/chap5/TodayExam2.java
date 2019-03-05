package chap5;

import java.util.Scanner;

/*
 * 두 개의 수를 입력하여 공약수 구하기
 */

public class TodayExam2 {

	public static void main(String[] args) {
		int nums[] = new int[2];
		Scanner scan = new Scanner(System.in);
		int small;
		int cnt = 0;

		System.out.print("두 개의 정수를 입력하시오 : ");
		for (int i = 0; i < 2; i++) {
			nums[i] = scan.nextInt();
		}
		
		small = nums[0];		
		if (nums[0] > nums[1]) {
			small = nums[0];
		}
		
		// TODO: 맨 마지막 콤마 없애는 더 기특하고 깜찍한 방법이 없을까 궁금하다
		
		int yaksu[] = new int [small]; // 메모리 낭비

		System.out.print(nums[0] + "와(과) " + nums[1] + " 의 공약수 : ");
		for (int i = 1; i <= small; i++) {
			if (nums[0] % i == 0 && nums[1] % i == 0) {
				yaksu[cnt++] = i;
			}
		}
		
		for (int i = 0; i < cnt - 1; i++) {
			System.out.print(yaksu[i] + " ,");
		}
		System.out.println(yaksu[cnt - 1]);
	}

}
