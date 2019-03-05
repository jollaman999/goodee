package chap5;

import java.util.Scanner;

public class ExamStrikeGame {

	public static void main(String[] args) {
		int qnum_b[] = new int[4]; // ������ ���ڸ� ������ �迭
		String input; // ������� ���� �Է��� ���� ����
		int try_cnt = 0; // �õ� Ƚ���� ������ ����
		int ball, strike; // ��, ��Ʈ����ũ Ƚ���� ����� ����
		
		for (int i = 0; i < qnum_b.length; i++) {
			// �� �ڸ��� ���� �� �޾ƿ� (���� ���� : 0~9)
			qnum_b[i] = (int) (Math.random() * 10);
			// �ߺ�����
			for (int j = 0; j < i; j++) {
				// �ߺ��Ǵ� ���� ���� ��� ���� i ��° ������ �������� ��õ�
				if (qnum_b[i] == qnum_b[j]) {
					i--;
				}
			}
		}
		
		// ������ Ȯ�ο� �ڵ�
		for (int i = 0; i < qnum_b.length; i++) {
			System.out.print(qnum_b[i]);
		}
		System.out.println();
		
		// ������ ���߱� ������ ���� ��� ����
		while(true) {
			boolean error = false; // ����� �Է��� ������ Ȯ���ϱ� ���� ����
			
			// ��, ��Ʈ����ũ 0���� �ʱ�ȭ
			ball = 0;
			strike = 0;
			
			// ����ڷ� ���� 4�ڸ� �� �Է��� ����
			System.out.print("4�ڸ� ���� �Է� �ϼ��� : ");
			Scanner scan = new Scanner(System.in);
			input = scan.next();
			
			if (input.length() != qnum_b.length) { // �Էµ� ���ڿ��� ���̰� 4�� �ʰ��� ��� ����
				System.out.println("���� : �Է� ������ �ʰ� �Ͽ����ϴ�! 4�ڸ��� �Է��Ͽ� �ֽʽÿ�!");
				error = true;
			} else { // �Էµ� ���ڿ��� ���̰� 4�� ���� ��� ���ڿ��� �� ���ڰ� ���ڰ� �´��� Ȯ��
				/* ���ڿ� Ȯ�� ���� ���� */
				// �� ���ڿ� �ϳ��� Ȯ��
				for (int i = 0; i < input.length(); i++) {
					// ���ڿ��� �������� Ȯ��
					if (input.charAt(i) < '0' || input.charAt(i) > '9') {
						// ���ڿ��� ���ڰ� �ƴ� ��� ���� ���������� ���� üũ
						System.out.println("���� : 4�ڸ� ���ڸ� �Է��Ͽ� �ֽʽÿ�!");
						error = true;
						break;
					}
					
					// ����ڰ� �Է��� 4�ڸ� �����߿� �ߺ��Ǵ� ���ڰ� �ִ� ��� Ȯ��
					if (i != 0) { // �� �� ���ڴ� Ȯ���� �ʿ� �����Ƿ� �н�
						for (int j = 0; j < i; j++) { // �� �պ��� ���� Ȯ������ ���� �ձ��� �ߺ� Ȯ��
							// �ߺ����� Ȯ�� && �̹� �ߺ��� ���� ã������ �� Ȯ���� �ʿ� ����
							if (input.charAt(i) == input.charAt(j) && !error) {
								// ����ڰ� �Է��� 4�ڸ� �����߿� �ߺ��Ǵ� ���ڰ� ���� ��� ���� ���������� ���� üũ
								System.out.println("���� : �ߺ��Ǵ� ���� ���� 4�ڸ� ���ڸ� �Է��Ͽ� �ֽʽÿ�!");
								error = true;
								break;
							}
						}
					}
				}
				/* ���ڿ� Ȯ�� ���� �� */
			}

			// ������ ������� �Է� Ȯ���� error �� true �� �Ǿ��ٸ� ���� ���� �ϰ� ���� �ٽ� ����
			if (error) {
				System.out.println();
				continue; // ���� �ٽ� ����
			} else {
				// ������ �ƴ� ��� �õ� Ƚ�� 1 ����
				try_cnt++;
			}
			
			// �ý��ۿ��� ������ ���� ����ڰ� �Է��� ���� �ϳ��� ��
			for (int i = 0; i < input.length(); i++) { // �ý��� �� �ڸ��� ������ ����
				for (int j = 0; j < input.length(); j++) { // ����� �Է� �� ������ ����
					// �ý����� �ڸ����� ���ڿ� ����� �Է� �ڸ����� ���ڰ� ������ ���
					if (qnum_b[i] == input.charAt(j) - '0') {
						if (i == j) { // �ڸ����� ������ ��Ʈ����ũ
							strike++;
						} else { // �ڸ����� �ٸ��� ��
							ball++;
						}
					}
				}
			}
			
			if (strike == qnum_b.length) { // ��Ʈ����ũ�� 4�� �Ǹ� ����
				// ���� �� �õ� Ƚ�� ���
				System.out.println();
				System.out.println("�����Դϴ�!");
				System.out.println("�õ� Ƚ�� : " + try_cnt);
				break; // ������ ã�����Ƿ� ���� ���� ����
			}
			
			// ������ �ƴϸ� ���� ��Ʈ����ũ ���� ���� ���
			System.out.println(ball + " ��, " + strike + " ��Ʈ����ũ");
			System.out.println();
		}
	}

}
