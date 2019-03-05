package chap5;

/*
 * 각 자릿수가 중복되지 않는 3자리 수를 모두 순서대로 출력 (각 자릿수는 1~9 범위내에서 선택)
 */

public class TodayExam1 {

	public static void main(String[] args) {
		int nums[] = new int[504]; // 9 * 8 * 7 = 504 (중복아닌 경우의 수)
		int num[] = new int[3]; // 3자리 수를 임시로 받을 변수
		
		/* 메인 루프 시작 */
		// 각 자리가 중복되지 않는 3자리 수 받아오기
		for (int k = 0; k < nums.length; k++) {
			/* 중복되지 않는 3자리수 가져오기 루프 시작 */ 
			// 각 자리가 중복되지 않는 3자리수 임시로 받아오기
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 10); // 램덤범위 0~9
				if (num[i] == 0) { // 각 자릿수는 1~9 범위내에서 선택하므로 랜덤값이 0일 경우 재시도
					i--;
					continue;
				}
				
				// 중복되는 자릿수 확인
				if (i != 0) { // 자릿수를 1개만 가져왔을 경우 즉, 자릿수를 맨처음 가져왔을 경우는 중복 확인 불필요
					for (int j = 0; j < i; j++) { // 맨 앞부터 현재 위치 까지 중복되는 자릿수 있는지 확인
						// 중복되는 자릿수 있을 경우 중복 확인 하는 루프 빠져나오고
						// i값을 감소시켜 해당위치 자릿수 다시 가져오도록 함
						if (num[j] == num[i]) {
							i--;
							break;
						}
					}
				}
			}
			/* 중복되지 않는 3자리수 가져오기 루프 끝 */ 
			
			// 가져온 각 자릿수에 1, 10, 100을 곱하여 실제 수를 구함
			int tmp_num = 0;
			int ten = 1;
			for (int i = 0; i < num.length; i++) {
				tmp_num += num[i] * ten; // 각 자릿수 더해줌
				ten *= 10; // 루프 돌때 마다  ten 의 값이 1, 10, 100 으로 변함
			}
			
			// 구해온 수를 nums[] 배열에 저장
			nums[k] = tmp_num;
			
			// 구해온 수와 nums[] 배열에 저장된 수들중 중복되는 수가 있는지 확인
			if (k != 0) { // 처음 구해온 수는 중복 확인 불필요
				boolean duplicated = false; // 중복 체크 변수
				
				/* 중복확인 루프 시작 */
				for (int i = 0; i < k; i++) { // 맨 앞부터 현재 저장하려는 위치까지 중복 확인 
					// 중복되는 수가 있을 경우 중복 확인 루프 빠져나옴
					if (nums[k] == nums[i]) {
						duplicated = true;
						break;
					}
				}
				/* 중복확인 루프 끝 */
				
				// 중복 되는 수가 있을 경우 메인 루프 재시도
				if (duplicated) {
					k--;
					continue;
				}
			}
		}
		/* 메인 루프 끝 */
		
		/* 버블 정렬 시작 */
		// 버블 정렬 - nums 배열에 구해온 수들을 작은 수 부터 큰 순서대로 정렬
		for (int i = 0; i < nums.length; i++) { // nums 배열의 갯수만큼 반복
			boolean change = false; // 더이상 정렬할 필요 없는지 확인하는 변수
			// 맨 앞부터 현재 위치(맨 뒤부터 하나씩 줄여나감) 까지 정렬
			for (int j = 0; j < nums.length - i - 1; j++) {
				// 큰 수를 뒤로 밀어 붙임
				if (nums[j] > nums[j + 1]) {
					int tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
					change = true; // 정렬이 더 필요함
				}
				

			}
			
			if (!change) { // 정렬을 더이상 할 필요 없음, 루프 빠져나옴
				break;
			}
		}
		/* 버블 정렬 끝 */
		
		// 10개씩 출력
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			// 10개 출력 했거나 제일 마지막 수일 경우는 줄 변경 그외는 콤마 붙임
			if ((i + 1) % 10 == 0 || i == nums.length -1) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}
	}

}
