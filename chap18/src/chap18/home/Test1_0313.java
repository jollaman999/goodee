package chap18.home;

import java.io.*;

public class Test1_0313 {
    public static void main(String[] args) {
        String filePath = "chap18\\bin\\chap18\\PrintStreamEx1.class";
        File file = new File(filePath);
        FileInputStream fis;

        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(filePath + " 파일을 열 수 없습니다!");
            return;
        }

        byte[] bytes = new byte[1024];
        int len;
        int j= 0;

        while (true) {
            try {
                len = fis.read(bytes);
                if (len == -1)
                    break;
                for (int i = 0; i < len; i++) {
                    if (j == 16) {
                        System.out.println();
                        j = 0;
                    }
                    System.out.printf("%02X ", bytes[i]);
                    j++;
                }

            } catch (IOException e) {
                System.out.println("파일 읽기 오류!");
                return;
            }
        }
    }
}
