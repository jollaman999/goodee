package chap6;

/*
 * 지역 변수 예제 : 지역 변수는 매서드 내부에서 선언된 변수이다.
 * 				매개 변수는 지역 변수다.
 * 				모든 지역 변수는 초기화 되어야 한다.
 */

public class LocalValEx1 {

	public static void main(String[] args) {
		int num = 0;	// 지역 변수, 반드시 초기화 필요
		boolean b = true;
		if (b) {
			num = 100;
		}
		System.out.println(num);
		String grade;
		int score = 80;
		switch (score / 10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.println(grade + "학점");
	}

}
