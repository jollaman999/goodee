package chap12.home;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test3 {

	public static void main(String[] args) {
		String date = "";
		Scanner scan = new Scanner(System.in);
		String date_pattern = "\\d{4}/\\d{2}/\\d{2}";
		Calendar calendar = Calendar.getInstance();;
		
		while(true) {
			System.out.print("��¥�� ������ ���� �������� �Է��ϼ��� (yyyy/MM/dd) : ");
			date = scan.next();
			
			if (!Pattern.matches(date_pattern, date)) {
				System.out.println("��¥ ������ �߸� �Է��Ͽ����ϴ�!");
				continue;
			}
			
			String date_split[] = date.split("/");
			
			int year = Integer.parseInt(date_split[0]);
			
			if (year < 1990 || year > 2999) {
				System.out.println("�⵵ ������ �ʰ� �Ͽ����ϴ�!");
				continue;
			}
			
			int month = Integer.parseInt(date_split[1]);
			
			if (month < 1 || month > 12) {
				System.out.println("�� ������ �ʰ� �Ͽ����ϴ�!");
				continue;
			}
			
			// �ش� ���� �ִ� ��¥�ϼ� ���� ū ��¥�� ���� �����޷� �Ѿ�� �� ����
			// ex) 2019/02/39 �Է½� 3�� 1�Ϸ� �Ѿ�� �ִ� ��¥ 31�� ��.
			calendar.set(year, month - 1, 1);
			
			int day = Integer.parseInt(date_split[2]);
			
			if (day < 1 || day > calendar.getActualMaximum(Calendar.DATE)) {
				System.out.println("�������� �ʴ� ��¥ �Դϴ�!");
				continue;
			}
			
			System.out.print(String.format("%4d�� ", year)
							+ String.format("%02d��", month)
							+ String.format("%02d���� ", day));
			
			// �ٽ� �Է��� ��¥�� ����
			calendar.set(year, month - 1, day);
			
			break;
		}

		scan.close();
		
		int yoil = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		String yoils[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.println(yoils[yoil] + "���� �Դϴ�.");
	}

}
