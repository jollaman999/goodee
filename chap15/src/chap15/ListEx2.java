package chap15;

import java.util.List;
import java.util.Vector;

/*
 * Vector 예제 : List 현 클래스
 * 			Collection 프레임워크 이전에 사용되던 클래스
 * 			List 인터페이스의 메서드와 이전에 사용되던 메서드가 혼재 되어 있음.
 */

public class ListEx2 {

	public static void main(String[] args) {
		// Vector<Double> list = new Vector<Double>();
		List<Double> list = new Vector<Double>();
		
		list.add(0.3);
		list.add(Math.PI);
		// list.addElement(5.0); // Vector 클래스의 멤버임. List 의 멤버가 아님
		list.add(5.0);
		System.out.println(list);
		
		double num = 3.0;
		int index = list.indexOf(num);
		
		if (index < 0) {
			System.out.println(num + " 은 list에 없는 요소입니다.");
		} else {
			System.out.println(num + " 의 위치는 " + index + "입니다.");
		}
		
		if (list.contains(num)) {
			// list.removeElement(num); // Vector 클래스의 멤버임. List 의 멤버가 아님.
			list.remove(num); 
			System.out.println(num + " 삭제됨.");
		}
		
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(0));
		
		List<Integer> list2 = new Vector<Integer>();
		
		for (int i = 1; i < 5; i++) {
			list2.add(i * 10);
		}
		System.out.println(list2.remove(0));
		System.out.println(list2.remove(new Integer(30)));
		System.out.println(list2.remove(30));
	}

}
