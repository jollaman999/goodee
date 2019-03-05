package chap11;

import java.util.Arrays;

// Arrays Ŭ���� : �迭 ���� ����� ������ �ִ� Ŭ���� -�迭 ����, �׸� ���� , �׸� �˻�

public class ArraysEx1 {

	public static void main(String[] args) {
		String[] arr1 = {"����", "�̸���", "���", "����"};
		for (String s : arr1) {
			System.out.println(s + ",");
		}
		System.out.println();
		
		Arrays.fill(arr1, "������");
		for (String s : arr1) {
			System.out.println(s + ",");
		}
		System.out.println();
		
		Arrays.fill(arr1, 1, 3, "������");
		for (String s : arr1) {
			System.out.println(s + ",");
		}
		System.out.println();
		
		// ���� : ������ �迭 100���� ���� ���� �迭�� �����Ͽ�, ��� ���� 100 ���� �����ϱ�
		int int_arr[] = new int[100];
		
		Arrays.fill(int_arr, 100);
		for (int i : int_arr) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println();
		
		String[] arr2 = {"����", "�̸���", "���", "����"};
		Arrays.sort(arr2);
		for (String s : arr2) {
			System.out.println(s + ",");
		}
		System.out.println();
	}

}
