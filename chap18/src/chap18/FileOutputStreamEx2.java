package chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOutputStreamEx2 {
    public static void main(String[] args) {
        firstMethod();
    }

    private static void firstMethod() {
        secondMethod();
    }

    private static void secondMethod() {
        try {
            throw new Exception("파일에 예외 메세지 저장하기");
        } catch (Exception e) {
            e.printStackTrace(); // 표준 오류 스트림으로 출력, 화면 출력
            try {
                FileOutputStream fos = new FileOutputStream("err.log");
                fos.write(e.getMessage().getBytes());
                e.printStackTrace(new PrintStream(fos));
                fos.write("\n\n".getBytes());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
