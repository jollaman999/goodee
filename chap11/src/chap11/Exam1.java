package chap11;

public class Exam1 {

	static int count(String str, String find) {
		int count = 0;
		int index = 0;
		int indexof = 0;
		
		if (str.indexOf(find, index) == -1) {
			return -1;
		}
		
		for (;;) {
			indexof = str.indexOf(find, index);
			
			if (indexof == -1) {
				break;
			}
			
			index = indexof + find.length();
			
			//System.out.println("indexof = " + indexof + ", index = " + index);
			
			if (str.length() < index) {
				break;
			}
			
			count++;
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "12")); // 2
		System.out.println(count("12345AB12AB345AB", "AB")); // 3
		System.out.println(count("12345", "6")); // -1
	}

}
