package chap11;

import java.util.regex.Pattern;

public class RegularEx3 {

	public static void main(String[] args) {
		// ���Խ����� ǥ��
		String tel = "010-123-4567";
		String pattern = "0\\d{1,2}-\\d{3,4}-\\d{4}";
		
		if (Pattern.matches(pattern, tel)) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}
	}

}
