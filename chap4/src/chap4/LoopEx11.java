package chap4;

import java.util.Scanner;

/*
 * ���忡 ������, ���Ƹ��� �հ� �ٸ����� ���� �Է¹޾�
 *  �������� �������� ���Ƹ��� �������� ���
 *  ����� �ȵ� ���� ���� ���� ���
 */

public class LoopEx11 {

	public static void main(String[] args) {
		final int DOG_LEGS = 4;
		final int BBIYAK_LEGS = 2;
		int dog_and_bbiyak, dog_and_bbiyak_leg;
		int dog = 0, bbiyak = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ���Ƹ��� ������ �Է� : ");
		dog_and_bbiyak = scan.nextInt();
		System.out.print("�������� ���Ƹ��� �ٸ��� �Է� : ");
		dog_and_bbiyak_leg = scan.nextInt();
		
		for (dog = 0; dog <= dog_and_bbiyak; dog++) {
			bbiyak = dog_and_bbiyak - dog;
			
			if (dog * DOG_LEGS + bbiyak * BBIYAK_LEGS == dog_and_bbiyak_leg) {
				System.out.println("������ : " + dog);
				System.out.println("���Ƹ� : " + bbiyak);
				return;
			}
		}
		
		if (dog == dog_and_bbiyak) {
			System.out.println("���� ����");
		}
		
	}

}

