package chap15.home;

/*
1. HashMap 객체에 (나라이름, 수도명) 쌍으로 저장하기.
(대한민국, 서울), (캐나다, 오타와), (영국, 런던), (스위스, 베른) 객체를 저장하는 프로그램 작성

2. 화면에서 나라이름을 입력 받아서, 입력 받은 나라의 수도를 출력하기.
 ==> 입력되지 않은 경우는 "수도가 등록된 나라가 아닙니다." 출력

 3. 등록된 나라가 아닌 경우 map 객체에 나라와 수도를 등록하기.
   다시 수도 조회를 할 수 있도록 반복문으로 처리하기.
   만약 나라이름에 "끝" 내용 입력되면
   종료전에 현재 등록된 내용을 개선된 for 구문을 이용하여 출력하고 프로그램 종료하기.
   */

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String[] legion = {"대한민국", "캐나다", "영국", "스위스"};
        String[] sudo = {"서울", "오타와", "런던", "베른"};

        for (int i = 0; i < legion.length; i++) {
            map.put(legion[i], sudo[i]);
        }

        while (true) {


            Scanner scan = new Scanner(System.in);
            System.out.print("검색할 나라이름을 입력하세요 (끝 입력시 종료) : ");

            String input = scan.next();

            if (input.equals("끝")) {
                Collection<String> values = map.values();
                int i = 0;
                for (String s : map.keySet()) {
                    System.out.println(s + "의 수도 : " + map.get(s));
                }
                System.out.println();
                return;
            }

            String new_legion = input;

            if (map.get(input) == null) {
                while (true) {
                    scan = new Scanner(System.in);
                    System.out.print("수도가 등록된 나라가 아닙니다. 새로 등록 하시겠습니까? (Y/N) : ");
                    input = scan.next();

                    if (input.equalsIgnoreCase("Y")) {
                        String new_sudo;

                        System.out.print("수도명을 입력하세요 : ");
                        new_sudo = scan.next();

                        map.put(new_legion, new_sudo);
                        break;
                    } else if (input.equalsIgnoreCase("N")) {
                        break;
                    } else {
                        System.out.println("잘 못 입력 하셨습니다");
                    }
                }
            } else {
                System.out.println(new_legion + "의 수도는 " + map.get(input) + "입니다.");
                while (true) {
                    scan = new Scanner(System.in);
                    System.out.print("등록된 나라를 수정 또는 삭제 하시겠습니까? (수정(U)/삭제(D)/N : ");
                    input = scan.next();

                    if (input.equalsIgnoreCase("U")) {
                        String new_sudo;

                        System.out.print("수정 할 수도명을 입력하세요 : ");
                        new_sudo = scan.next();

                        map.put(new_legion, new_sudo);
                        break;
                    } else if (input.equalsIgnoreCase("D")) {
                        map.remove(new_legion);
                        System.out.println(new_legion + " 나라를 삭제합니다.");
                        break;
                    } else if (input.equalsIgnoreCase("N")) {
                        break;
                    } else {
                        System.out.println("잘 못 입력 하셨습니다");
                    }
                }
            }
        }
    }
}
