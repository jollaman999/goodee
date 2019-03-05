package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Date 클래스 : 날짜를 표현하는 클래스
// SimpleDateFormat : Date 형태의 객체를 지정항 format 으로 출력할 수 있는 기능 (format 메서드)을 가진 클래스
// format : Date 형태의 객체를 지정한 format 으로 출력할 수 있는 기능     Date 객체 => 형식화된 문자열
// parse : 형식화된 문자열을 Date 객체로 변경 가능    Date 객체 <= 형식화된 문자열

public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		/*
		 * yyyy : 년도를 4자리로 출력
		 * MM : 월을 2자리로 출력
		 * dd : 일을 2자리로 출력
		 * HH : 시간을 2자리로 출력
		 * mm : 분을 2자리로 출력
		 * ss : 초를 2자리로 출력
		 * E : 요일 출력
		 * a : 오전, 오후 구분
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
		
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd은 E요일 입니다.");
		System.out.println(sf3.format(d));
		SimpleDateFormat sf4 = new SimpleDateFormat("E");
		String w = sf4.format(d);
		System.out.println(w);
	}

}
