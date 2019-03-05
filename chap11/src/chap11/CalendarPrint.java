package chap11;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarPrint {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		int month = 0;
		
		while(true) {
			System.out.print("년도를 입력하세요 : ");
			year = scan.nextInt();
			
			if (year < 1990 || year > 2999) {
				System.out.println("년도 범위 초과 (1990~2999 사이를 입력하세요!)");
				continue;
			}
			
			break;
		}
		
		
		while(true) {
			System.out.print("월을 입력하세요 : ");
			month = scan.nextInt();
			
			if (month < 1 || month > 12) {
				System.out.println("월 범위 초과 (1~12 사이를 입력하세요!)");
				continue;
			}
			
			break;
		}
		
		scan.close();
		
		today.set(year, month - 1, 1);
		
		int first_day_of_week = today.get(Calendar.DAY_OF_WEEK) - 1;
		int day_max = today.getActualMaximum(Calendar.DATE) - 1;
		
		String calendar[][] = new String[7][7];
		
		for (int i = 0; i < calendar.length; i++) {
			for (int j = 0; j < calendar[i].length; j++) {
				calendar[i][j] = new String("   "); 
			}
		}
		
		calendar[0][0] = "일    ";
		calendar[0][1] = "월    ";
		calendar[0][2] = "화    ";
		calendar[0][3] = "수    ";
		calendar[0][4] = "목    ";
		calendar[0][5] = "금    ";
		calendar[0][6] = "토    ";
		
		int day_count = 0;
		
		for (int j = first_day_of_week; j < calendar[1].length; j++) {
			calendar[1][j] = String.format("%2d ", day_count + 1); 
			day_count++;
		}
		
		for (int i = 2; i < calendar.length; i++) {
			for (int j = 0; j < calendar[i].length; j++) {
				if (day_count > day_max) {
					break;
				}
				calendar[i][j] = String.format("%2d ", day_count + 1); 
				day_count++;
			}
		}
		
		System.out.println();
		System.out.println(String.format("     %4d년 %2d월", year, month));
		System.out.println();
		
		for (int i = 0; i < calendar.length; i++) {
			for (int j = 0; j < calendar[i].length; j++) {
				System.out.print(calendar[i][j]);
			}
			System.out.println();
		}
	}

}
