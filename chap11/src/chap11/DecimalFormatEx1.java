package chap11;

import java.text.DecimalFormat;
import java.text.ParseException;

// DecimalFormat : ���ڸ� ����ȭ �Ͽ� ����ϱ�
// parse() : ���ڰ� <= ���ڿ�
// format() : ����ȭ�� ���ڿ� <= ���ڰ�

public class DecimalFormatEx1 {

	public static void main(String[] args) {
		// ���ڸ� ���ڸ� ���� ����ϰ�, �Ҽ��� ���� 2�ڸ��� ǥ����.
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		try {
			Number num = df1.parse("1,234,567.89");
			double d = num.doubleValue();
			System.out.print(d + "->");
			System.out.println(df2.format(num));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(df1.format(12345.67));
		System.out.printf("%,.2f\n", 12345.67);
		
		// ���� : str + 123 �� ����� �Ҽ��� ���ڸ����� , �־� ����ϱ�
		String str = "123,456";
		DecimalFormat df3 = new DecimalFormat("#,###");
		try {
			Number num1 = df3.parse(str);
			int n = num1.intValue() + 123;
			System.out.println(df3.format(n));
			System.out.printf("%,d\n", n);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
