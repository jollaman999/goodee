package chap5;

import java.util.Arrays;

/*
 * 배열의 복사
 * 1. for 구문을 이용하여 하나씩 복사
 * 2. System.arrayCopy() 매서드를 이용하기
 */

public class ArrayEx23 {

	public static void main(String[] args) {
		// 1 for 구문을 이용하여 하나씩 복사
		int score[] = { 90, 80, 70 };
		int score2[] = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			score2[i] = score[i];
		}
		
		// 2. System.arrayCopy() 매서드를 이용하기
		score2 = new int[5];
		/*
		 * (원본배열, 원본배열의 복사 시작 인덱스, 복사배열, 복사시작인덱스, 요소의 갯수)
		 */
		System.arraycopy(score, 0, score2, 1, score.length);
		
		// 3. Arrays 클래스 이용
		score2 = null;
		/*
		 * score 원본배열을 5개의 방을 가진 복사 배열에 복사
		 */
		score2 = Arrays.copyOf(score, 5);
		
		for (int s : score2) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}

}
