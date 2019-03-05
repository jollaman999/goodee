package chap11;

import java.text.DecimalFormat;
import java.text.ParseException;

// DecimalFormat : 숫자를 형식화 하여 출력하기
// parse() : 숫자값 <= 문자열
// format() : 형식화된 문자열 <= 숫자값

public class DecimalFormatEx1 {

	public static void main(String[] args) {
		// 숫자를 세자리 마다 출력하고, 소숫점 이하 2자리만 표시함.
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
		
		// 문제 : str + 123 의 결과를 소숫점 세자리마다 , 넣어 출력하기
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
