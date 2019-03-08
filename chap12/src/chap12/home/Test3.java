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
			System.out.print("날짜를 다음과 같은 형식으로 입력하세요 (yyyy/MM/dd) : ");
			date = scan.next();
			
			if (!Pattern.matches(date_pattern, date)) {
				System.out.println("날짜 형식을 잘못 입력하였습니다!");
				continue;
			}
			
			String date_split[] = date.split("/");
			
			int year = Integer.parseInt(date_split[0]);
			
			if (year < 1990 || year > 2999) {
				System.out.println("년도 범위를 초과 하였습니다!");
				continue;
			}
			
			int month = Integer.parseInt(date_split[1]);
			
			if (month < 1 || month > 12) {
				System.out.println("월 범위를 초과 하였습니다!");
				continue;
			}
			
			// 해당 월의 최대 날짜일수 보다 큰 날짜가 들어가면 다음달로 넘어가는 것 방지
			// ex) 2019/02/39 입력시 3월 1일로 넘어가고 최대 날짜 31로 됨.
			calendar.set(year, month - 1, 1);
			
			int day = Integer.parseInt(date_split[2]);
			
			if (day < 1 || day > calendar.getActualMaximum(Calendar.DATE)) {
				System.out.println("존재하지 않는 날짜 입니다!");
				continue;
			}
			
			System.out.print(String.format("%4d년 ", year)
							+ String.format("%02d월", month)
							+ String.format("%02d일은 ", day));
			
			// 다시 입력한 날짜로 설정
			calendar.set(year, month - 1, day);
			
			break;
		}

		scan.close();
		
		int yoil = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		String yoils[] = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(yoils[yoil] + "요일 입니다.");
	}

}
