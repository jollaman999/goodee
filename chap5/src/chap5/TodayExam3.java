package chap5;

/*
 * command line ���� ���� �� �Է� �޾� �Ҽ� ���� �Ǻ� �Ҽ� �ƴϸ� ��� ���� ���
 */

public class TodayExam3 {

	public static void main(String[] args) {
		int cnt = 2;
		int input = Integer.parseInt(args[0]);
		
		if (args.length == 0) {
			System.out.println("command ���ڸ� �Է��ϼ���");
			return;
		}
		
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				cnt++;
			}
		}
		
		if (cnt == 2) {
			System.out.println(input + "�� �Ҽ� �Դϴ�.");
		} else {
			System.out.println(input + "�� (��) �Ҽ��� �ƴմϴ�. ����� ������ " + cnt +"�� �Դϴ�.");
		}
	}

}
