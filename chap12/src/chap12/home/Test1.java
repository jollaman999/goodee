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
			System.out.print("���� 5���� �Է��Ͻÿ� : ");
			
			for (int i = 0; i < nums.length; i++) {
				nums[i] = scan.nextInt();
				if (nums[i] < 1 || nums[i] > 99) {
					error = true;
					break;
				}
				sum += nums[i];
			}
			
			if (error) {
				System.out.println("1~99 ���� ���ڸ� �Է��ϼ���!");
				error = false;
				scan.nextLine(); // �Է� ���� ����
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
		
		System.out.println("��հ� : " + avg + ", " + "�߾Ӱ� : " + mid);
	}

}
