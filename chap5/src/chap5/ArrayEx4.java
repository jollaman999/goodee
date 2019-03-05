package chap5;

/*
 * ¹è¿­ÀÇ ¼±¾ð, »ý¼º, ÃÊ±âÈ­
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
		
		String[] strarr = {"È«±æµ¿", "±è»ñ°«", "ÀÌ¸ù·æ"};
		for (String s : strarr) {
			System.out.println(s);
		}
	}

}
