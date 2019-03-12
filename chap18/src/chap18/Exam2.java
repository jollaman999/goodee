package chap18;

/*
파일명을 입력받아서 해당 파일이 존재하면,
입력된 파일명의 확장자를 .bak 파일을 출력파일로 하녀
입력된 파일의 내용을 .bak 파일에 복사하기 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;
        String filename;

        System.out.print("파일명을 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        filename = scan.nextLine();

        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재하지 않습니다!");
            return;
        }
        try {
            fos = new FileOutputStream(filename + ".bak");
        } catch (FileNotFoundException e) {
            System.out.println(filename + ".bak 파일을 생성할 수 없습니다!");
            return;
        }

        byte[] bytes = null;
        try {
            bytes = new byte[fis.available()];
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        int data = 0;
        while (true) {
            try {
                data = fis.read(bytes);
                if (data == -1)
                    break;
                fos.write(bytes);
            } catch (IOException e) {
                System.out.println("파일 읽기 오류!");
                return;
            }
        }
    }
}
