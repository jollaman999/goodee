package chap11.home;

/*
 * 결과가 나오도록 메서드 구현하기
 * 메서드명 : format
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 * 반환타입 : String
 * 매개변수 : String str, int length, int alignment
 *                                 (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)
 [결과]
 가나다****
**가나다**
****가나다
가나           
 */

public class Test5 {
	private static String format(String str, int length, int alignment) {
		StringBuffer output = new StringBuffer();
		
		if (length <= str.length()) {
			output.append(str.substring(0, length));
			return output.toString();
		}
		
		
		for (int i = 0; i < length; i ++) {
			output.append("*");
		}
		
		switch (alignment) {
		case 0:
			output.replace(0, str.length(), str);
			break;
		case 1:
			int start = (length - str.length()) / 2;
			output.replace(start, start + str.length(), str);
			break;
		case 2:
			output.replace(length - str.length(), length, str);
			break;

		default:
			output.append("잘못된 정렬 선택!");
			break;
		}
		
		return output.toString();
	}
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7,0));
		System.out.println(format(str, 7,1));
		System.out.println(format(str, 7,2));
		System.out.println(format(str, 2,0));
	}
}