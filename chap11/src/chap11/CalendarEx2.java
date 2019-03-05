package chap11;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		today.set(2019, (4-1), 1);
		String week = null;
		switch (today.get(Calendar.DAY_OF_WEEK)) {
		case 1 :
			week = "��";
			break;
		case 2 :
			week = "��";
			break;
		case 3 :
			week = "ȭ";
			break;
		case 4 :
			week = "��";
			break;
		case 5 :
			week = "��";
			break;
		case 6 :
			week = "��";
			break;
		case 7 :
			week = "��";
			break;
		}
		
		System.out.printf("��¥ : %d�� %02d�� %02d�� %s����\n",
				today.get(Calendar.YEAR), today.get(Calendar.MONTH) + 1,
				today.get(Calendar.DATE), week);
		
		System.out.println("Timezone(-12~12) : " + today.get(Calendar.ZONE_OFFSET) / (60*60*1000));
		
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timezone);
		System.out.println("LA : Timezone(-12~12) : " + now.get(Calendar.ZONE_OFFSET) / (60*60*1000));
		
	}

}
