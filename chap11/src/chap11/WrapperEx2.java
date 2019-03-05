package chap11;

public class WrapperEx2 {

	public static void main(String[] args) {
		char[] data = {'A', 'a', '9', '&'};
		
		for (char c : data) {
			if (Character.isUpperCase(c)) {
				System.out.println(c + "는 대문자 입니다");
			} else if (Character.isLowerCase(c)) {
				System.out.println(c + "는 소문자 입니다");
			} else if (Character.isDigit(c)) {
				System.out.println(c + "는 숫자 입니다");
			} else {
				System.out.println(c + "는 일반 문자 입니다");
			}
		}
		
		Character ch = new Character('A');
		if (ch == 'A') {
			System.out.println("ㅇㅇ");
		} else {
			System.out.println("ㄴㄴ");
		}
		
		if (ch.equals('A')) {
			System.out.println("ㅇㅇ");
		} else {
			System.out.println("ㄴㄴ");
		}
	}

}
