package chap11;

public class EqualsEx2 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if (str1 == str2) {
			System.out.println("str1과 str2는 같은 객체다.");
		} else {
			System.out.println("str1과 str2는 다른 객체다.");
		}
		
		if (str1.equals("abc")) {
			System.out.println("str1과 str2는 같은 내용의 문자열 객체다.");
		} else {
			System.out.println("str1과 str2는 다른 내용의 문자열 객체다.");
		}
	}

}
