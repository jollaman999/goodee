package chap11;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		if (sb1.equals(sb2)) {
			System.out.println("sb1 과 sb2의 내용이 같음");
		} else {
			System.out.println("sb1 과 sb2의 내용이 다름");
		}
		
		if (sb1.toString().equals(sb2.toString())) { // String 객체 변경 후 내용 비교 가능
			System.out.println("sb1 과 sb2의 내용이 같음");
		} else {
			System.out.println("sb1 과 sb2의 내용이 다름");
		}
	}

}
