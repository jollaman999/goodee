package chap11;

import java.util.Arrays;

// Arrays 클래스 : 배열 조작 기능을 가지고 있는 클래스 -배열 복사, 항목 정렬 , 항목 검색

public class ArraysEx1 {

	public static void main(String[] args) {
		String[] arr1 = {"월매", "이몽룡", "향단", "방자"};
		for (String s : arr1) {
			System.out.println(s + ",");
		}
		System.out.println();
		
		Arrays.fill(arr1, "성춘향");
		for (String s : arr1) {
			System.out.println(s + ",");
		}
		System.out.println();
		
		Arrays.fill(arr1, 1, 3, "춘향전");
		for (String s : arr1) {
			System.out.println(s + ",");
		}
		System.out.println();
		
		// 문제 : 정수형 배열 100개의 방을 가진 배열을 생성하여, 모든 값을 100 값을 저장하기
		int int_arr[] = new int[100];
		
		Arrays.fill(int_arr, 100);
		for (int i : int_arr) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println();
		
		String[] arr2 = {"월매", "이몽룡", "향단", "방자"};
		Arrays.sort(arr2);
		for (String s : arr2) {
			System.out.println(s + ",");
		}
		System.out.println();
	}

}
