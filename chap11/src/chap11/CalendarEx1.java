package chap11;

import java.util.Calendar;

/*
 * Calendar Ŭ���� : �߻� Ŭ������. getInstance() Ŭ���� �޼��带 �̿��Ͽ� ��ü ������.
 */

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("�⵵ : " + today.get(Calendar.YEAR));
		// today.get(Calendar.MONTH) : 0(1��) ~ 11(12��)
		System.out.println("�� : " + (today.get(Calendar.MONTH) + 1));
		System.out.println("�� : " + today.get(Calendar.DATE));
		System.out.println("�� : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�⵵ ���� ��° �� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� ��° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�� ���� ���� : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("���� : " + today.get(Calendar.DAY_OF_WEEK)); // 1:��, 2:��, ..., 7:��
		System.out.println("�� ���� ���° ���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("����(0)����(1) : " + today.get(Calendar.AM_PM));
		System.out.println("�ð� (0~11) : " + today.get(Calendar.HOUR));
		System.out.println("�ð� (0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� : " + today.get(Calendar.MINUTE));
		System.out.println("�� : " + today.get(Calendar.SECOND));
		System.out.println("�и��� : " + today.get(Calendar.MILLISECOND));
		
		System.out.println("�̴��� ������ �� : " + today.getActualMaximum(Calendar.DATE));
	}

}
