package chap11;

public class StringEx2 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println("s.charAt(4) : " + s.charAt(4));
		// ABCDEFGH - abc = -32 : ���İ��� �޼���
		System.out.println("s.comareTo('ABC') : " + s.compareTo("abc")); // ���İ��� �޼��� (������ ������ �� ���)
		// IgnoreCase : ��ҹ��� �������
		System.out.println(
				"s.compareToIgnoreCase('ABC') : " + s.compareToIgnoreCase("abcdefgh"));
		// 2���� ���ڿ��� ���϶� concat() : s + "abc"
		System.out.println("s.concat('abc') : " + s.concat("abc"));
		// s ���ڿ��� ���� ���ڿ��� "FGH"?
		System.out.println("s.endsWith('FGH') : " + s.endsWith("FGH"));
		// s ���ڿ��� ���� ���ڿ��� "ABC"?
		System.out.println("s.startsWith('ABC') : " + s.startsWith("ABC"));
		// ��ҹ��� ���о��� ���� ��
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
		
		s = "              ���ڿ���  trim �޼���                   ";
		System.out.println("s.trim() : " + s.trim());
		
		s = "HTML,CSS,JavaScript,Java,JSP,Spring";
		String[] subject = s.split(",");
		for (int i = 0; i < subject.length; i++) {
			System.out.println((i + 1) + " : " + subject[i]);
		}
		
		// ���ڿ� <= �⺻��
		s = "sasa" + 123;
		System.out.println(s);
		s = String.valueOf(123);
		System.out.println("sasa" + s);
		
		// �⺻�� <= ���ڿ�
		int i = Integer.parseInt("123");
		double d = Double.parseDouble("123.5");
		
		// format() : ���Ĺ��ڸ� ����Ͽ� ����ȭ �� �� �ִ� ���
		s = String.format("%.2f", d);
		System.out.println(s);
		s = String.format("%05d", i);
		System.out.println(s);
	}

}
