package chap11;

public class WrapperEx2 {

	public static void main(String[] args) {
		char[] data = {'A', 'a', '9', '&'};
		
		for (char c : data) {
			if (Character.isUpperCase(c)) {
				System.out.println(c + "�� �빮�� �Դϴ�");
			} else if (Character.isLowerCase(c)) {
				System.out.println(c + "�� �ҹ��� �Դϴ�");
			} else if (Character.isDigit(c)) {
				System.out.println(c + "�� ���� �Դϴ�");
			} else {
				System.out.println(c + "�� �Ϲ� ���� �Դϴ�");
			}
		}
		
		Character ch = new Character('A');
		if (ch == 'A') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		if (ch.equals('A')) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}

}
