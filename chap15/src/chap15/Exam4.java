package chap15;

/*
1~99 까지의 정수를 입력받아서 입력된 값이 0이 되면 입력을 종료.
단, 중복된 숫자는 무시하기.
set1 오름차순 정렬되도록 출력
set2 내림차순 정렬되도록 출력
 */

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class Exam4 {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }
        };
        TreeSet<Integer> set1 = new TreeSet<>(c);
        TreeSet<Integer> set2 = new TreeSet<>(c.reversed());
        Scanner scan = new Scanner(System.in);

        while(true) {
            int input;

            System.out.print("1~99 범위의 숫자를 입력하세요 (0 : 입력중지) : ");

            try {
                input = scan.nextInt();
                System.out.println(input);
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력!!");
                continue;
            }

            if (input == 0)
                break;

            if (input < 1 || input > 99) {
                System.out.println("입력 범위 초과!!");
                continue;
            }

            set1.add(input);
            set2.add(input);
        }

        System.out.println("오름차순 : " + set1);
        System.out.println("내림차순 : " + set2);
    }
}
