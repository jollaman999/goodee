package chap3;

public class OpEx4 {
	
	// ^ XOR : 두개의 비트가 다르면 1, 같으면 0

	public static void main(String[] args) {
		System.out.println(6&3);
		System.out.println(6|3);
		System.out.println(6^3); // 110 ^ 011 = 101 --> 5
		
		System.out.println(~10);
		/*
		 * 00001010 --> 11110101
		 */
	}
}

