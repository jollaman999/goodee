package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ȭ�鿡�� 5���� ������ �Է¹޾Ƽ� ��հ� �߰����� ����ϰ�, �ְ����� ���� �л��� �ε����� ����ϱ�
 */
public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> al = new ArrayList<Integer>();
		int sum = 0;
		int avg = 0;
		int mid = 0;
		int max = 0;
		
		System.out.println("5���� ������ �Է� �Ͻÿ� : ");
		
		boolean error = false;
		
		while(true) {
			System.out.print("���� 5���� �Է��Ͻÿ� : ");
			
			for (int i = 0; i < 5; i++) {
				int num = scan.nextInt();
				
				if (num < 1 || num > 99) {
					error = true;
					break;
				}
				al.add(num);
				sum += num;
			}
			
			if (error) {
				System.out.println("1~99 ���� ���ڸ� �Է��ϼ���!");
				al = new ArrayList<Integer>();
				error = false;
				scan.nextLine(); // �Է� ���� ����
				continue;
			}
			
			break;
		}
		
		scan.close();
		
		avg = sum / al.size();
		
		Collections.sort(al);
		
		mid = al.get(al.size() / 2);
		max = al.indexOf(Collections.max(al));
		
		System.out.println("�ְ��� �ε��� : " + max + ", �߰��� : " + mid + ", ��� : " + avg);
	}

}
