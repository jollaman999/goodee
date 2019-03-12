package chap18;

/*
chap18.Exam2.java를 FileReader, FileWriter 클래스를 이용하여 구현하기
 */

import java.io.*;
import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        FileReader fr;
        FileWriter fw;
        String filename;

        System.out.print("파일명을 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        filename = scan.nextLine();

        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재하지 않습니다!");
            return;
        }
        try {
            fw = new FileWriter(filename + ".bak");
        } catch (IOException e) {
            System.out.println(filename + ".bak 파일을 생성할 수 없습니다!");
            return;
        }

        char[] buf = new char[1024];
        int len;
        while (true) {
            try {
                len = fr.read(buf);
                if (len == -1)
                    break;
                fw.write(buf, 0, len);
            } catch (IOException e) {
                System.out.println("파일 읽기/쓰기 오류!");
                return;
            }
        }
        try {
            fw.flush();
            //fw.close();
        } catch (IOException e) {
            System.out.println("파일 읽기/쓰기 오류!");
        }
    }
}
