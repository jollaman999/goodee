package chap4;

public class TodayExam1 {

	public static void main(String[] args) {
		int sum = 0;
		int num_sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			num_sum = 0;
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				num_sum += j;
				if (j < i) {
					System.out.print("+");
				}
			}
			System.out.print(")");
			sum += num_sum;
			if (i != 10) {
				System.out.print("+");
			} else {
				System.out.print("=" + sum);
			}
		}
	}

}
