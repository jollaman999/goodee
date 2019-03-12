package chap7;

import java.util.Scanner;

// 0~31 수중 생각한 숫자 맞추기
// 5비트 수(5자리 2진수 수)를 뒤에서 부터 자릿수가 맞는지 확인하여 수를 추론함

public class ComputerIsSmarterThanYou {

	public static void main(String[] args) {
		boolean dec_ok[] = new boolean[5]; // 2진수 각 자릿수 맞는지 확인 
		int dec[] = {1, 2, 4, 8, 16}; // 2진수 자릿수
		int dec_index = 0; // 2진수 자릿수 확인 위치
		
		Scanner scan = new Scanner(System.in);
		
		while (dec_index < 5) {
			int cnt = 0; // 한줄당 5개씩 숫자 표시하기 위해 체크할 카운트
			
			for (int i = 0; i < 5; i++) { // 0~31
				
				if (++cnt % 5 == 0) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + ", ");
				}
			}
			
			System.out.print("\n\n0~31 까지의 수를 생각하거라!\n네가 생각한 숫자가 여기 있느냐? (y / n) : ");
			
			while (true) {
				String input = scan.next();
				
				if (input.charAt(0) == 'y' || input.charAt(0) == 'Y') {
					dec_ok[dec_index] = true;
				} else if (input.charAt(0) == 'n' || input.charAt(0) == 'N')  {
					dec_ok[dec_index] = false;
				} else {
					System.out.print("y / n 으로만 답하거라! 네가 생각한 숫자가 여기 있느냐? : ");
					continue;
				}
				break;
			}
			
			dec_index++;
		}
		scan.close();
		
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			if (dec_ok[i]) {
				num += dec[i];
			}
		}
		
		System.out.println("이것이 네가 생각한 숫자로구나!!");
		System.out.println(num);
	}

}
