package chap11;

/*
 다음의 결과가 나오도록  프로그램을 완성하시오.
[결과]
(1!2@3^4~5),!@^~() -> 12345
(1!2@3^4~5),12345 -> (!@^~)
 */

public class Test1 {
	
	static String delChar(String input, String filter) {
		char targets[] = new char[filter.length()];
		
		for (int i = 0; i < filter.length(); i++) {
			targets[i] = filter.charAt(i);
		}
		
		for (int i = 0; i < filter.length(); i++) {
			input = input.replace(Character.toString(targets[i]), "");
		}
		
		return input;
	}
	
	private static String delChar2(String str1, String str2) {
		String sb = "";
		
		for (int i = 0; i < str1.length(); i++) {
			if (str2.indexOf(str1.charAt(i)) < 0) {
				sb += str1.charAt(i);
			}
		}
		
		return sb;
	}
	
	private static String delChar3(String str1, String str2) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < str1.length(); i++) {
			if (str2.indexOf(str1.charAt(i)) < 0) {
				sb.append(str1.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5),!@^~() -> " + delChar("(1!2@3^4~5)", "!@^~()"));
		System.out.println("(1!2@3^4~5),12345 -> " + delChar("(1!2@3^4~5)", "12345"));
		
		System.out.println("(1!2@3^4~5),!@^~() -> " + delChar2("(1!2@3^4~5)", "!@^~()"));
		System.out.println("(1!2@3^4~5),12345 -> " + delChar2("(1!2@3^4~5)", "12345"));
		
		System.out.println("(1!2@3^4~5),!@^~() -> " + delChar3("(1!2@3^4~5)", "!@^~()"));
		System.out.println("(1!2@3^4~5),12345 -> " + delChar3("(1!2@3^4~5)", "12345"));
	}
}