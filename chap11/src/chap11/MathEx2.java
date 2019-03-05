package chap11;

/*
 * getRand() 메서드 구현하기
 * 
 * 	주어진 범위 (-3 ~ 1) 에 속한 임의의 정수값을 반환. 양쪽 경계값이 모두 범위에 포함됨.
 * 	두개의 숫자는 어느쪽이 커도 상관 없음.
 * 	반환타입 : int
 */

public class MathEx2 {
	
	private static int getRand(int i1, int i2) {
		int min = i1, max = i2;
		int cnt;
		
		if (min > max) {
			int temp;
			temp = min;
			min = max;
			max = temp;
		}
		
		cnt = max - min + 1;
		
		int random = (int) (Math.random() * cnt) + min;
		
		return random;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(3, -10) + ",");
		}
		System.out.println();
	}

}
