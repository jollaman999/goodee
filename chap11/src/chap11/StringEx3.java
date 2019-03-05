package chap11;

public class StringEx3 {

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : " + str);
		change(str);
		System.out.println("main : change() ÀÌÈÄ str = " + str);
	}

	private static void change(String str) {
		str += "456";
		System.out.println("change() : str = " + str);
	}
}
