package chap5;

public class Exam3 {

	public static void main(String[] args) {
		System.out.println("���� ���ڿ��� �� ���ĺ� ������ �˷��帮������~");
		System.out.println("cloudinary is a cloud service that offers a solution to a web application's entire image management pipeline");
		
		System.out.println();
		
		String s = "cloudinary is a cloud service that offers a solution to a web application's entire image management pipeline";
		int alphabet[] = new int[26];
		char c;
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				alphabet[c - 'a']++;
			}
		}
		
		c = 'a';
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println(c + " : " + alphabet[i] + " ��");
			c++;
		}
	}

}
