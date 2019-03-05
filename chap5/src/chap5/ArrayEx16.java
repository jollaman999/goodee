package chap5;

/*
 * 2차원 배열의 행의 합과 열의 합 구하기
 * int arr[][] = { {10, 20}, {30, 40}, {50, 60, 70}}
 * 
 * 0행의 합 : 
 * 1행의 합 : 
 * 2행의 합 : 
 * 0열의 합 : 
 * 1열의 합 : 
 * 2열의 합 : 
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
			System.out.println(i + "행의 합 : " + sum);
		}
		
		for (int i = 0; i < tot.length; i++) {
			System.out.println(i + "열의 합 : " + tot[i]);
		}
	}

}

