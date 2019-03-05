package chap5;

/*
 * 2차원 배열의 선언, 생성, 초기화를 한줄에 해결하기
 */

public class ArrayEx14 {

	public static void main(String[] args) {
		int arr[][] = { {10, 20, 30}, {40, 50, 60, 60, 80} };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}

}
