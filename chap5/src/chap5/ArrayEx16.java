package chap5;

/*
 * 2���� �迭�� ���� �հ� ���� �� ���ϱ�
 * int arr[][] = { {10, 20}, {30, 40}, {50, 60, 70}}
 * 
 * 0���� �� : 
 * 1���� �� : 
 * 2���� �� : 
 * 0���� �� : 
 * 1���� �� : 
 * 2���� �� : 
 */

public class ArrayEx16 {

	public static void main(String[] args) {
		int arr[][] = { {10, 20}, {30, 40}, {50, 60, 70}};
		int max_col = 0;
		
		for (int[] a : arr) {
			if (max_col < a.length) {
				max_col = a.length;
			}
		}
		
		int tot[] = new int[max_col];
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				tot[j] += arr[i][j];
			}
			System.out.println(i + "���� �� : " + sum);
		}
		
		for (int i = 0; i < tot.length; i++) {
			System.out.println(i + "���� �� : " + tot[i]);
		}
	}

}

