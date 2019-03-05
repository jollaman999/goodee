package chap5;

public class Exam2 {

	public static void main(String[] args) {
		int answer[] = new int[10];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (Math.random() * 10) + 1;
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print("answer[" + i + "] : " + answer[i] + " ");
			if (answer[i] < 10) {
				System.out.print(" ");
			}
			for (int j = 0; j < answer[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
