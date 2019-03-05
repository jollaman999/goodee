package chap5;

/*
 * command line 에서 숫자 하나를 입력받아 숫자의 약수를 화면에 출력하기
 * int num = Integer.parseInt(args[0]) 메서드를 이용
 */

public class ArrayEx12 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
				if (i != num) {
					System.out.print(", ");
				}
			}
		}
	}

}
