package chap5;

/*
 * command 라인에서 문자열 배열 입력받기
 */

public class ArrayEx11 {

	public static void main(String[] args) {
		for (String s : args) {
			System.out.println("Hello, " + s);
		}
	}

}
