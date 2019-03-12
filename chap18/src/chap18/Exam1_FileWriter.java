package chap18;

/*
화면에서 내용을 입력받고,
내용을 입력받아 입력받은 파일에 입력된 내용 저장하기
exit 가 입력되면 내용 입력 종료하기

[결과]
파일명을 입력하세요
aaa.txt
저장할 내용을 입력하세요
안녕하세요
반갑습니다
exit
 */

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exam1_FileWriter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("파일명을 입력하세요 : ");
        String filename = scan.nextLine();
        // FileWriter 클래스 이용

        FileWriter fw;
        try {
            fw = new FileWriter(filename);
        } catch (IOException e) {
            System.out.println("파일 생성 오류!");
            return;
        }

        System.out.println("저장할 내용을 입력하세요 (exit 입력시 종료)");
        String input;
        while (true) {
            input = scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("입력을 종료하고 파일에 작성합니다.");
                try {
                    fw.flush();
                    fw.close();
                } catch (IOException e) {
                    System.out.println("파일 작성 오류!");
                    return;
                }
                break;
            }
            try {
                fw.write(input + "\n");
            } catch (IOException e) {
                System.out.println("파일 작성 오류!");
                return;
            }
        }
    }
}
