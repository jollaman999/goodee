package chap5;

import java.util.Scanner;

/*
 * �� ���� ���� �Է��Ͽ� ����� ���ϱ�
 */

public class TodayExam2 {

	public static void main(String[] args) {
		int nums[] = new int[2];
		Scanner scan = new Scanner(System.in);
		int small;
		int cnt = 0;

		System.out.print("�� ���� ������ �Է��Ͻÿ� : ");
		for (int i = 0; i < 2; i++) {
			nums[i] = scan.nextInt();
		}
		
		small = nums[0];		
		if (nums[0] > nums[1]) {
			small = nums[0];
		}
		
		// TODO: �� ������ �޸� ���ִ� �� ��Ư�ϰ� ������ ����� ������ �ñ��ϴ�
		
		int yaksu[] = new int [small]; // �޸� ����

		System.out.print(nums[0] + "��(��) " + nums[1] + " �� ����� : ");
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
