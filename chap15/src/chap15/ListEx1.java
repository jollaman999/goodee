package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * Lㅑst 예제 : 객체를 추가한 순서를 유지함.
 * 			인덱스 사용가능함. 가변배열이라고 함.
 *   구현 클래스
 *      ArrayList : List 의 대표 클래스임. 모든 메서드가 도익화 되어있음.
 *      Vector : ArrayList와 같은 기능의 클래스, 모든 메서드가 동이화 되어있음.
 *      LinkedList : FiFO를 구현한 클래스
 */

public class ListEx1 {

	public static void main(String[] args) {
		// <Integer> : 제네릭 표현. Integer 객체들만의 모임.
		// List<Integer> list = new ArrayList<Integer>();
		List<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 객체 : " + list.get(i));
		}
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		// sub부분 list 객체 구현하기
		// 1번 인덱스 부터 3번 인덱스 까지 부분 List 객체 구하기
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		//List<Integer> list2 = list.subList(1, 4);
		System.out.println("sort 이전 list2 : " + list2);
		System.out.println(list2);
		
		// Collections : 클래스 : Collection 객체들의 여러 기능을 저장하고 있는 클래스
		// Collection : 인터페이스
		Collections.sort(list);
		System.out.println("sort 이후 list : " + list);
		System.out.println("sort 이후 list2 : " + list2);
		System.out.println("list 객체 중 최대값 : " + Collections.max(list));
		System.out.println("list 객체 중 최소값 : " + Collections.min(list));

		System.out.println("list2 객체 중 최대값 : " + Collections.max(list2));
		System.out.println("list2 객체 중 최대값의 인덱스 : " + list2.indexOf(Collections.max(list2)));
		
		System.out.println(list2.indexOf(6)); // 해당 객체 없는 경우 -1 리턴
	}

}
