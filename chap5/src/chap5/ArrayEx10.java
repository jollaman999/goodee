package chap5;

import java.util.Scanner;

/*
 * ������ ������ ������ ���� �����Ͽ� ������ ���� ��ŭ�� ���� ����
 * 
 * 3600
 * ��������
 * 
 * 3000
 * 500 : 5��
 * 100 : 5��
 */

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		int[] check_cnt = new int[6];
		
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		for (int i = 0; i < coin.length; i++) {
			int tmp = money / coin[i];
			if (tmp > cnt[i]) {
				tmp = cnt[i];
				cnt[i] = 0;
			} else {
				cnt[i] -= tmp;
			}
			check_cnt[i] = tmp;
			money  -= coin[i] * check_cnt[i];
		}
		
		if (money != 0) {
			System.out.println("���� ����");
			return;
		} else {
			for (int i = 0; i < coin.length; i++) {
				System.out.println(coin[i] + "�� : " + check_cnt[i] + "��");
			}
			
			System.out.println("\n" + "���� ������");
			
			for (int i = 0; i < coin.length; i++) {
				System.out.println(coin[i] + "�� : " + cnt[i] + "��");
			}
		}
	}

}
