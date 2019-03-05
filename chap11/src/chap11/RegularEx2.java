package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularEx2 {

	public static void main(String[] args) {
		String tel = "HP:010-1111-1111,HOME:02-999-9999,OFF:02-2345-5678";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		/*
		 * 그룹1 : (0\\d{1,2})
		 * 그룹2 : (\\d{3,4})
		 * 그룹3 : (\\d{4})
		 */
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(tel);
		
		int i = 0;
		while(m.find()) { // tel 문자열에서 패턴이 맞는 것을 찾아서 저장
			System.out.println(++i + ":" + m.group() + "->" + m.group(1)
			+ "," + m.group(2) + "," + m.group(3));
		}
	}

}
