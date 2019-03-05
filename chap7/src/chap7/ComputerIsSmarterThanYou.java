package chap7;

import java.util.Scanner;

// 0~31 ���� ������ ���� ���߱�
// 5��Ʈ ��(5�ڸ� 2���� ��)�� �ڿ��� ���� �ڸ����� �´��� Ȯ���Ͽ� ���� �߷���

public class ComputerIsSmarterThanYou {

	public static void main(String[] args) {
		boolean dec_ok[] = new boolean[5]; // 2���� �� �ڸ��� �´��� Ȯ�� 
		int dec[] = {1, 2, 4, 8, 16}; // 2���� �ڸ���
		int dec_index = 0; // 2���� �ڸ��� Ȯ�� ��ġ
		
		Scanner scan = new Scanner(System.in);
		
		while (dec_index < 5) {
			int cnt = 0; // ���ٴ� 5���� ���� ǥ���ϱ� ���� üũ�� ī��Ʈ
			
			for (int i = 0; i < 5; i++) { // 0~31
				
				if (++cnt % 5 == 0) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + ", ");
				}
			}
			
			System.out.print("\n\n0~31 ������ ���� �����ϰŶ�!\n�װ� ������ ���ڰ� ���� �ִ���? (y / n) : ");
			
			while (true) {
				String input = scan.next();
				
				if (input.charAt(0) == 'y' || input.charAt(0) == 'Y') {
					dec_ok[dec_index] = true;
				} else if (input.charAt(0) == 'n' || input.charAt(0) == 'N')  {
					dec_ok[dec_index] = false;
				} else {
					System.out.print("y / n ���θ� ���ϰŶ�! �װ� ������ ���ڰ� ���� �ִ���? : ");
					continue;
				}
				break;
			}
			
			dec_index++;
		}
		scan.close();
		
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			if (dec_ok[i]) {
				num += dec[i];
			}
		}
		
		System.out.println("�̰��� �װ� ������ ���ڷα���!!");
		System.out.println(num);
	}

}
