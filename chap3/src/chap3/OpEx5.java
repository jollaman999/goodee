package chap3;

public class OpEx5 {

	/*
	 * << n : �������� n��Ʈ �̵��ϱ�. ���� �������� ��Ʈ�� 0���� ä��
	 * >> n : ���������� n��Ʈ �̵��ϱ�. ���� ���� ��Ʈ�� ��ȣ��Ʈ�� ä��
	 * >>> n : ���������� n��Ʈ �̵��ϱ�. ���� ���ʺ�Ʈ�� 0���� ä��. 
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
