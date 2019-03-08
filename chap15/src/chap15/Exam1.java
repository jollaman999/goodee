package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 5명의 점수를 입력받아서 평균과 중간값을 출력하고, 최고점을 받은 학생의 인덱스를 출력하기
 */
public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> al = new ArrayList<Integer>();
		int sum = 0;
		int avg = 0;
		int mid = 0;
		int max = 0;
		
		System.out.println("5명의 점수를 입력 하시오 : ");
		
		boolean error = false;
		
		while(true) {
			System.out.print("숫자 5개를 입력하시오 : ");
			
			for (int i = 0; i < 5; i++) {
				int num = scan.nextInt();
				
				if (num < 1 || num > 99) {
					error = true;
					break;
				}
				al.add(num);
				sum += num;
			}
			
			if (error) {
				System.out.println("1~99 범위 숫자만 입력하세요!");
				al = new ArrayList<Integer>();
				error = false;
				scan.nextLine(); // 입력 버퍼 비우기
				continue;
			}
			
			break;
		}
		
		scan.close();
		
		avg = sum / al.size();
		
		Collections.sort(al);
		
		mid = al.get(al.size() / 2);
		max = al.indexOf(Collections.max(al));
		
		System.out.println("최고점 인덱스 : " + max + ", 중간값 : " + mid + ", 평균 : " + avg);
	}

}
