package chap5;

/*
 * ���� �迭 : ������ �迭�� �̸� �迭�� ������ �������� �ʾƵ� ��. ��, ù���� �迭�� ũ��� �ݵ�� �����ؾ� �Ѵ�.
 * 	n���� �迭�� n-1 �� �迭�� ���������� ũ��� �ݵ�� �����ؾ� �Ѵ�.
 */

public class ArrayEx20 {

	public static void main(String[] args) {
		int[][] arr = new int[3][]; // ���� �迭
		arr[0] = new int[] {1};
		arr[1] = new int[] {2, 3};
		arr[2] = new int[] {4, 5, 6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
