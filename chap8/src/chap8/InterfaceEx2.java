package chap8;

/*
 * �������̽��� �޼����� ����Ÿ������ ���
 */

interface Parseable {
	void parse(String filename);
}

class ParseManager {
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	
	@Override
	public void parse(String filename) {
		System.out.println(filename + " => XML Parsing");
	}
}

class HTMLParser implements Parseable {
	
	@Override
	public void parse(String filename) {
		System.out.println(filename + " => HTML Parsing");
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Parseable p = ParseManager.getParser("XML");
		p.parse("doc.xml");
		p = ParseManager.getParser("HTML");
		p.parse("doc.html");
	}

}
