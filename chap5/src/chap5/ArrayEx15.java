package chap5;

/*
 * 5명 학생의 국어, 영어, 수학 점수를 학생별 총점, 평균을 출력하고 과목별 총점을 출력하기
 * 
 * [결과]
 * 			국어		영어 		수학		총점		평균
 * 1번 학생 :	100		80		90		270		90.0
 * ...
 * ==============================================
 * 	과목총점	450	...
 */

public class ArrayEx15 {

	public static void main(String[] args) {
		int[][] score = { {100, 80, 90}, {80, 80, 70}, {80, 75, 90}, {90, 75, 95}, {100, 60, 75} };
		
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			double avg = 0;
			
			System.out.print((i + 1) + "번 학생");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("\t" + score[i][j]);
				sum += score[i][j];
			}
			System.out.print("\t" + sum);
			avg = (double) sum / score[i].length;
			System.out.print(String.format("\t%.1f", avg));
			System.out.println();
		}
		
		System.out.println("=============================================");
		
		System.out.print("과목 총점");
		for (int i = 0; i < score[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < score.length; j++) {
				sum += score[j][i];
			}
			System.out.print("\t" + sum);
		}
		System.out.println();
	}

}
