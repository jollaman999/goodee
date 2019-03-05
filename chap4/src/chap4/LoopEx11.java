package chap4;

import java.util.Scanner;

/*
 * 농장에 강아지, 병아리의 합과 다리수의 합을 입력받아
 *  강아지의 마리수와 병아리의 마리수를 출력
 *  계산이 안될 경우는 정답 없음 출력
 */

public class LoopEx11 {

	public static void main(String[] args) {
		final int DOG_LEGS = 4;
		final int BBIYAK_LEGS = 2;
		int dog_and_bbiyak, dog_and_bbiyak_leg;
		int dog = 0, bbiyak = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("강아지와 병아리의 마리수 입력 : ");
		dog_and_bbiyak = scan.nextInt();
		System.out.print("강아지와 병아리의 다리수 입력 : ");
		dog_and_bbiyak_leg = scan.nextInt();
		
		for (dog = 0; dog <= dog_and_bbiyak; dog++) {
			bbiyak = dog_and_bbiyak - dog;
			
			if (dog * DOG_LEGS + bbiyak * BBIYAK_LEGS == dog_and_bbiyak_leg) {
				System.out.println("강아지 : " + dog);
				System.out.println("병아리 : " + bbiyak);
				return;
			}
		}
		
		if (dog == dog_and_bbiyak) {
			System.out.println("정답 없음");
		}
		
	}

}

