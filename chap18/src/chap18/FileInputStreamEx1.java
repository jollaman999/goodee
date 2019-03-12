package chap18;

import java.io.FileInputStream;

public class FileInputStreamEx1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("chap18/src/chap18.InputStreamEx1.java");
//        int data;
//        while((data = fis.read()) != -1) {
//            System.out.print((char)data);
//        }
        int len;
        byte[] buf = new byte[fis.available()];
//        while((len = fis.read(buf)) != -1) {
//            System.out.print(new String(buf, 0, len));
//        }

        while((len = fis.read(buf, 0, buf.length)) != -1) {
            System.out.print(new String(buf, 0, len));
        }
    }
}
