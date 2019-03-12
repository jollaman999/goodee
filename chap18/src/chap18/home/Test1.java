package chap18.home;

// Comment
// 한글 관련 인코딩 문제가 좀 있다..
// 처음 저장된 파일도 UTF-8 이 아니면 한글 다 깨진다..

import java.io.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.print("원본 파일 이름을 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();

        BufferedReader br;
        FileOutputStream fos;

        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.out.println(filename + "파일이 존재하지 않습니다!");
            return;
        }

        filename += ".line";

        try {
            fos = new FileOutputStream(filename);
        } catch (FileNotFoundException e) {
            System.out.println(filename + " 파일을 생성할 수 없습니다!");
            return;
        }

        System.out.println();
        System.out.println(filename + " 파일이 생성.");

        String line_data;
        int line = 0;

        while (true) {
            try {
                line_data = br.readLine();
                if (line_data == null)
                    break;
                line++;
                fos.write((line + ":" + line_data + "\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.out.println("파일 종료 오류!");
            return;
        }

        System.out.println();
        System.out.println(filename + " 파일의 내용");
        System.out.println();

        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.out.println(filename + "파일이 존재하지 않습니다!");
            return;
        }

        while (true) {
            try {
                line_data = br.readLine();
                if (line_data == null)
                    break;
                System.out.println(line_data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
