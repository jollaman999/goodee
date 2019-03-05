package chap5;

/*
 * command line 으로 부터 수 입력 받아 소수 인지 판별 소수 아니면 약수 갯수 출력
 */

public class TodayExam3 {

	public static void main(String[] args) {
		int cnt = 2;
		int input = Integer.parseInt(args[0]);
		
		if (args.length == 0) {
			System.out.println("command 숫자를 입력하세요");
			return;
		}
		
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				cnt++;
			}
		}
		
		if (cnt == 2) {
			System.out.println(input + "은 소수 입니다.");
		} else {
			System.out.println(input + "은 (는) 소수가 아닙니다. 약수의 갯수는 " + cnt +"개 입니다.");
		}
	}

}
