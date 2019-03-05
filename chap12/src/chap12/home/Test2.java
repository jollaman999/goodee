package chap12.home;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		for (int month = 1; month <= 12; month++) {
			int day = 1;
			
			while (true) {
				calendar.set(2019, month - 1, day);
				
				if (calendar.get(Calendar.DAY_OF_WEEK)
						== Calendar.SUNDAY) {
					break;
				}
				
				day++;
			}
			
			day += 7;
			
			String strDate = "2019년 " + String.format("%02d", month)
								+ "월 " + String.format("%02d일", day);
			SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
			Date d = null;
			
			try {
				d = sf.parse(strDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			System.out.println(sf.format(d));
		}
	}

}
