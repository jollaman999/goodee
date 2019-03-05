package chap5;

import java.util.Scanner;

public class ArrayEx21 {

	public static void main(String[] args) {
		int r_max = 0;
		int num = 1;
		
		System.out.println("제일 마지막 행의 열의 갯수 입력");
		Scanner scan = new Scanner(System.in);
		r_max = scan.nextInt();
		
		int nums[][] = new int[r_max][];
		
		for (int i = r_max - 1; i >= 0 ; i--) {
			nums[i] = new int[i + 1];
		}
		
		for (int j = r_max - 1; j >= 0; j--) {
			for (int i = j; i < r_max; i++) {
				nums[i][j] = num++;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
