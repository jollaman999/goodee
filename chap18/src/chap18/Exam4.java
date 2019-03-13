package chap18;

/*
src/chap18 폴더의 .java 파일 중 InputStream 관련 모든 소스를 InputStream예제.txt 파일로 생성하기

InputStream 관련 모든 소스 : XXXInputStreamXXX.java

1. f1 = File("src/chap18") 설정
2. f1의 하위 폴더, 파일를 받아서, 그 중의 파일이면서, 파일의 이름에 InputStream 값이 존재하면
FileInputStream 으로 설정.
3. FileInputStream Vector에 저장 => SequeneceInputStream 객체로 연결.
4. SequeneceInputStream 읽어서 "InputStream예제.txt" 파일로 생성하기
 */

import java.io.*;
import java.util.Vector;
import java.util.regex.Pattern;

public class Exam4 {
    public static void main(String[] args) {
        String filePath = "chap18/src/chap18";
        File f1 = new File(filePath);
        String[] files = f1.list();

        FileInputStream fis;
        Vector<InputStream> v = new Vector<>();

        if (files != null) {
            for (String f : files) {
                File f2 = new File(filePath, f);
                if (f2.isFile()) {
                    try {
                        String fileName = f2.getName();
                        String fileNamePattern = ".*InputStream.*.[jJ][aA][vV][aA]";

                        if (Pattern.matches(fileNamePattern, fileName)) {
                            System.out.println(f2 + " 파일을 엽니다.");
                            fis = new FileInputStream(f2);
                        } else {
                            continue;
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(f2 + " 파일을 열 수 없습니다!");
                        continue;
                    }
                    v.add(fis);
                }
            }

            String output_fileName = "InputStream예제.txt";
            System.out.println("찾은 파일들을 " + output_fileName + " 에 작성합니다.");
            FileOutputStream fos;
            try {
                fos = new FileOutputStream(output_fileName);
            } catch (FileNotFoundException e) {
                System.out.println(output_fileName + " 파일을 생성할 수 없습니다!");
                return;
            }

            int len;
            byte[] buf = new byte[1024];
            SequenceInputStream sis = new SequenceInputStream(v.elements());
            while (true) {
                try {
                    len = sis.read(buf);
                    if (len  == -1)
                        break;
                    fos.write(buf, 0, len);
                } catch (IOException e) {
                    System.out.println("파일 읽기/쓰기 오류!");
                    return;
                }
            }
            try {
                fos.flush();
                fos.close();
            } catch (IOException e) {
                System.out.println("파일 종료 오류!");
            }
        }
    }
}
