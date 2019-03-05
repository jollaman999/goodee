package chap3;

public class OpEx5 {

	/*
	 * << n : 왼쪽으로 n비트 이동하기. 가장 오른쪽의 비트는 0으로 채움
	 * >> n : 오른쪽으로 n비트 이동하기. 가장 왼쪽 비트는 부호비트로 채움
	 * >>> n : 오른쪽으로 n비트 이동하기. 가장 왼쪽비트는 0으로 채움. 
	 */
	
	public static void main(String[] args) {
		System.out.println(8 << 2);
		// 00001000
		// 00100000
		
		System.out.println(8 >> 2);
		// 00001000
		// 00000010
		
		System.out.println(8 >>> 2);
		// 00001000
		// 00000100
		
		System.out.println(-8 << 2);
		// 1111000
		// 1111110
		
		System.out.println(-8 >> 2);
		// 1111000
		// 0011110
		System.out.println(8 << 2);
		System.out.println(-8 >>> 2);
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toBinaryString(-8));
	}

}
