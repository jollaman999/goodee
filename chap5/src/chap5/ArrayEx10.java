package chap5;

import java.util.Scanner;

/*
 * 동전의 종류와 동전의 갯수 지정하여 지정된 갯수 만큼만 동전 변경
 * 
 * 3600
 * 동전부족
 * 
 * 3000
 * 500 : 5개
 * 100 : 5개
 */

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		int[] check_cnt = new int[6];
		
		System.out.println("금액을 입력하세요");
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
			System.out.println("동전 부족");
			return;
		} else {
			for (int i = 0; i < coin.length; i++) {
				System.out.println(coin[i] + "원 : " + check_cnt[i] + "개");
			}
			
			System.out.println("\n" + "남은 동전들");
			
			for (int i = 0; i < coin.length; i++) {
				System.out.println(coin[i] + "원 : " + cnt[i] + "개");
			}
		}
	}

}
