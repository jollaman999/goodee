package chap12.home;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int nums[] = new int[5];
		int sum = 0;
		int avg = 0;
		int mid = 0;
		
		Scanner scan = new Scanner(System.in);
		
		boolean error = false;
		
		while(true) {
			System.out.print("숫자 5개를 입력하시오 : ");
			
			for (int i = 0; i < nums.length; i++) {
				nums[i] = scan.nextInt();
				if (nums[i] < 1 || nums[i] > 99) {
					error = true;
					break;
				}
				sum += nums[i];
			}
			
			if (error) {
				System.out.println("1~99 범위 숫자만 입력하세요!");
				error = false;
				scan.nextLine(); // 입력 버퍼 비우기
				continue;
			}
			
			break;
		}
		
		scan.close();
		
		avg = sum / nums.length;
		
		Arrays.sort(nums);
		
//		int mid_value = (nums[0] + nums[nums.length - 1]) / 2;
//		int mid_gap = Math.abs(nums[0] - mid_value);
//		mid = nums[0];
//		
//		for (int i = 1; i < nums.length; i++) {
//			if (Math.abs(nums[i] - mid_value) < mid_gap) {
//				mid = nums[i];
//				mid_gap = Math.abs(nums[i] - mid_value);
//			}
//		}
		mid = nums[2];
		
		System.out.println("평균값 : " + avg + ", " + "중앙값 : " + mid);
	}

}
