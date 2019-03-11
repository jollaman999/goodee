package chap15;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        String filePath = "C:\\";
        File f1 = new File(filePath);
        String[] files = f1.list();
        for (String f : files) {
            File f2 = new File(filePath, f);
            if (f2.isDirectory()) {
                System.out.printf("%s : 디렉토리\n", f);
            } else {
                System.out.printf("%s : 파일(%,d 바이트)\n", f, f2.length());
            }
        }
    }
}
