package chap11;

public class StringEx2 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println("s.charAt(4) : " + s.charAt(4));
		// ABCDEFGH - abc = -32 : 정렬관련 메서드
		System.out.println("s.comareTo('ABC') : " + s.compareTo("abc")); // 정렬관련 메서드 (순서를 지정할 때 사용)
		// IgnoreCase : 대소문자 상관없이
		System.out.println(
				"s.compareToIgnoreCase('ABC') : " + s.compareToIgnoreCase("abcdefgh"));
		// 2개의 문자열을 붙일때 concat() : s + "abc"
		System.out.println("s.concat('abc') : " + s.concat("abc"));
		// s 문자열의 끝의 문자열이 "FGH"?
		System.out.println("s.endsWith('FGH') : " + s.endsWith("FGH"));
		// s 문자열의 시작 문자열이 "ABC"?
		System.out.println("s.startsWith('ABC') : " + s.startsWith("ABC"));
		// 대소문자 구분없이 문자 비교
		System.out.println("s.equalsIgnoreCase('abcdefgh') : " + s.equalsIgnoreCase("abcdefgh"));
		
		s = "This is a String";
		System.out.println("s.indexOf('i') : " + s.indexOf('i'));
		System.out.println("s.indexOf('is') : " + s.indexOf("is"));
		System.out.println("s.indexOf('is', 3) : " + s.indexOf("is", 3));
		System.out.println("s.lastIndexOf('is') : " + s.lastIndexOf("is"));
		System.out.println("s.length() : " + s.length());
		System.out.println("s.replace(is, IS) : " + s.replace("is", "IS"));
		System.out.println("s.substring(5) : " + s.substring(5));
		System.out.println("s.substring(5, 13) : " + s.substring(5, 13));
		System.out.println("s.toLowerCase() : " + s.toLowerCase());
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
		
		s = "              문자열의  trim 메서드                   ";
		System.out.println("s.trim() : " + s.trim());
		
		s = "HTML,CSS,JavaScript,Java,JSP,Spring";
		String[] subject = s.split(",");
		for (int i = 0; i < subject.length; i++) {
			System.out.println((i + 1) + " : " + subject[i]);
		}
		
		// 문자열 <= 기본형
		s = "sasa" + 123;
		System.out.println(s);
		s = String.valueOf(123);
		System.out.println("sasa" + s);
		
		// 기본형 <= 문자열
		int i = Integer.parseInt("123");
		double d = Double.parseDouble("123.5");
		
		// format() : 서식문자를 사용하여 형식화 할 수 있는 기능
		s = String.format("%.2f", d);
		System.out.println(s);
		s = String.format("%05d", i);
		System.out.println(s);
	}

}
