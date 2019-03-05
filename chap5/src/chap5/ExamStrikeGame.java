package chap5;

import java.util.Scanner;

public class ExamStrikeGame {

	public static void main(String[] args) {
		int qnum_b[] = new int[4]; // 문제의 숫자를 저장할 배열
		String input; // 사용자의 숫자 입력을 받을 변수
		int try_cnt = 0; // 시도 횟수를 저장할 변수
		int ball, strike; // 볼, 스트라이크 횟수가 저장될 변수
		
		for (int i = 0; i < qnum_b.length; i++) {
			// 각 자릿수 랜덤 값 받아옴 (랜덤 범위 : 0~9)
			qnum_b[i] = (int) (Math.random() * 10);
			// 중복제거
			for (int j = 0; j < i; j++) {
				// 중복되는 수가 있을 경우 이전 i 번째 랜덤값 가져오기 재시도
				if (qnum_b[i] == qnum_b[j]) {
					i--;
				}
			}
		}
		
		// 랜덤값 확인용 코드
		for (int i = 0; i < qnum_b.length; i++) {
			System.out.print(qnum_b[i]);
		}
		System.out.println();
		
		// 정답을 맞추기 전까지 루프 계속 돌림
		while(true) {
			boolean error = false; // 사용자 입력의 에러를 확인하기 위한 변수
			
			// 볼, 스트라이크 0으로 초기화
			ball = 0;
			strike = 0;
			
			// 사용자로 부터 4자리 수 입력을 받음
			System.out.print("4자리 수를 입력 하세요 : ");
			Scanner scan = new Scanner(System.in);
			input = scan.next();
			
			if (input.length() != qnum_b.length) { // 입력된 문자열의 길이가 4를 초과한 경우 에러
				System.out.println("에러 : 입력 범위를 초과 하였습니다! 4자리만 입력하여 주십시오!");
				error = true;
			} else { // 입력된 문자열의 길이가 4가 맞을 경우 문자열의 각 문자가 숫자가 맞는지 확인
				/* 문자열 확인 루프 시작 */
				// 각 문자열 하나씩 확인
				for (int i = 0; i < input.length(); i++) {
					// 문자열이 숫자인지 확인
					if (input.charAt(i) < '0' || input.charAt(i) > '9') {
						// 문자열이 숫자가 아닌 경우 루프 빠져나오고 에러 체크
						System.out.println("에러 : 4자리 숫자만 입력하여 주십시오!");
						error = true;
						break;
					}
					
					// 사용자가 입력한 4자리 숫자중에 중복되는 숫자가 있는 경우 확인
					if (i != 0) { // 맨 앞 숫자는 확인할 필요 없으므로 패스
						for (int j = 0; j < i; j++) { // 맨 앞부터 현재 확인중인 문자 앞까지 중복 확인
							// 중복인지 확인 && 이미 중복된 숫자 찾았으면 더 확인할 필요 없음
							if (input.charAt(i) == input.charAt(j) && !error) {
								// 사용자가 입력한 4자리 숫자중에 중복되는 숫자가 있을 경우 루프 빠져나오고 에러 체크
								System.out.println("에러 : 중복되는 숫자 없이 4자리 숫자를 입력하여 주십시오!");
								error = true;
								break;
							}
						}
					}
				}
				/* 문자열 확인 루프 끝 */
			}

			// 위에서 사용자의 입력 확인후 error 가 true 가 되었다면 한줄 변경 하고 루프 다시 돌림
			if (error) {
				System.out.println();
				continue; // 루프 다시 돌림
			} else {
				// 에러가 아닐 경우 시도 횟수 1 증가
				try_cnt++;
			}
			
			// 시스템에서 생성된 수와 사용자가 입력한 수를 하나씩 비교
			for (int i = 0; i < input.length(); i++) { // 시스템 수 자릿수 증가용 루프
				for (int j = 0; j < input.length(); j++) { // 사용자 입력 수 증가용 루프
					// 시스템의 자릿수의 숫자와 사용자 입력 자릿수의 숫자가 동일한 경우
					if (qnum_b[i] == input.charAt(j) - '0') {
						if (i == j) { // 자릿수가 같으면 스트라이크
							strike++;
						} else { // 자릿수가 다르면 볼
							ball++;
						}
					}
				}
			}
			
			if (strike == qnum_b.length) { // 스트라이크가 4가 되면 정답
				// 정답 및 시도 횟수 출력
				System.out.println();
				System.out.println("정답입니다!");
				System.out.println("시도 횟수 : " + try_cnt);
				break; // 정답을 찾았으므로 루프 빠져 나옴
			}
			
			// 정답이 아니면 볼과 스트라이크 수를 각각 출력
			System.out.println(ball + " 볼, " + strike + " 스트라이크");
			System.out.println();
		}
	}

}
