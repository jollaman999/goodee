package chap15;

/*
File 클래스 주요 메서드 예제
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:/temp1");
        System.out.printf("%s 폴더 생성 : %b\n", f1.getAbsolutePath(), f1.mkdir());
        File f2 = new File("C:/temp1/test.txt");
        System.out.printf("%s 파일 생성 : %b\n", f1.getAbsolutePath(), f2.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(f2);
        for(int i=1; i<11; i++) {
            String data = i+" 번째 졸라.\r\n";
            fileOutputStream.write(data.getBytes());
        }
        fileOutputStream.close();
        System.out.printf("파일이름 : %s, 파일크기 : %,d byte\n", f2.getName(), f2.length());

        File f3 = new File("C:/temp/test2.txt");
        System.out.printf("%s->%s 이름 변경 : %b\n", f2.getName(), f3.getName(), f2.renameTo(f3));
        System.out.printf("%s 파일 최종 수정 일시 : %s\n", f3.getName(), new Date(f3.lastModified()));
        System.out.printf("%s 파일 삭제 : %b\n", f3.getName(), f3.delete());
    }
}
