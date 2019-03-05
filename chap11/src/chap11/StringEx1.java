package chap11;

public class StringEx1 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		if (s1 == s2) {
			System.out.println("s1과 s2는 같은 객체임");
		} else {
			System.out.println("s1과 s2는 다른 객체임");
		}
		
		if (s1.equals(s2)) {
			System.out.println("s1과 s2는 같은 내용임");
		} else {
			System.out.println("s1과 s2는 다른 내용임");
		}
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if (s3 == s4) {
			System.out.println("s3과 s4는 같은 객체임");
		} else {
			System.out.println("s3과 s4는 다른 객체임");
		}
		
		if (s3.equals(s4)) {
			System.out.println("s3과 s4는 같은 내용임");
		} else {
			System.out.println("s3과 s4는 다른 내용임");
		}
	}

}
