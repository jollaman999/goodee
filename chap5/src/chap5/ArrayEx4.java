package chap5;

/*
 * �迭�� ����, ����, �ʱ�ȭ
 */

public class ArrayEx4 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		
//		for (int a : arr) {
//			System.out.println(a);
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
		arr = new int[]{100, 200, 300, 400, 500, 600, 700, 800};
		
//		for (int a : arr) {
//			System.out.println(a);
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
		String[] strarr = {"ȫ�浿", "���", "�̸���"};
		for (String s : strarr) {
			System.out.println(s);
		}
	}

}
