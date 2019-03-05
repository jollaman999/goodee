package chap5;

/*
 * 5�� �л��� ����, ����, ���� ������ �л��� ����, ����� ����ϰ� ���� ������ ����ϱ�
 * 
 * [���]
 * 			����		���� 		����		����		���
 * 1�� �л� :	100		80		90		270		90.0
 * ...
 * ==============================================
 * 	��������	450	...
 */

public class ArrayEx15 {

	public static void main(String[] args) {
		int[][] score = { {100, 80, 90}, {80, 80, 70}, {80, 75, 90}, {90, 75, 95}, {100, 60, 75} };
		
		System.out.println("\t����\t����\t����\t����\t���");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			double avg = 0;
			
			System.out.print((i + 1) + "�� �л�");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("\t" + score[i][j]);
				sum += score[i][j];
			}
			System.out.print("\t" + sum);
			avg = (double) sum / score[i].length;
			System.out.print(String.format("\t%.1f", avg));
			System.out.println();
		}
		
		System.out.println("=============================================");
		
		System.out.print("���� ����");
		for (int i = 0; i < score[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < score.length; j++) {
				sum += score[j][i];
			}
			System.out.print("\t" + sum);
		}
		System.out.println();
	}

}
