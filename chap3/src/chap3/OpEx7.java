package chap3;

import java.util.Scanner;

public class OpEx7 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���(0~100)");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result  = score >= 60 ? "�հ�" : "���հ�";
		System.out.println(score + " ������ " + result + "�Դϴ�");
		System.out.println(score + " ������ " + (score >= 60 ? "�հ�" : "���հ�") + "�Դϴ�");
		int i = 1;
		String error = (false)?"��":"����";
		System.out.println(error);
	}

}
