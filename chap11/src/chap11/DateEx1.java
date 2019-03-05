package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Date Ŭ���� : ��¥�� ǥ���ϴ� Ŭ����
// SimpleDateFormat : Date ������ ��ü�� ������ format ���� ����� �� �ִ� ��� (format �޼���)�� ���� Ŭ����
// format : Date ������ ��ü�� ������ format ���� ����� �� �ִ� ���     Date ��ü => ����ȭ�� ���ڿ�
// parse : ����ȭ�� ���ڿ��� Date ��ü�� ���� ����    Date ��ü <= ����ȭ�� ���ڿ�

public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		/*
		 * yyyy : �⵵�� 4�ڸ��� ���
		 * MM : ���� 2�ڸ��� ���
		 * dd : ���� 2�ڸ��� ���
		 * HH : �ð��� 2�ڸ��� ���
		 * mm : ���� 2�ڸ��� ���
		 * ss : �ʸ� 2�ڸ��� ���
		 * E : ���� ���
		 * a : ����, ���� ����
		 */
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2019-03-09";
		Date d = null;
		try {
			d = sf2.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd�� E���� �Դϴ�.");
		System.out.println(sf3.format(d));
		SimpleDateFormat sf4 = new SimpleDateFormat("E");
		String w = sf4.format(d);
		System.out.println(w);
	}

}
