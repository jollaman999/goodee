package chap18;

import java.io.IOException;
import java.io.InputStream;

/*
이것은 한글
 */

public class InputStreamEx1 {
    public static void main (String[] args) throws IOException {
        InputStream in = System.in;
        int data;
        while ((data = in.read()) != -1) {
            System.out.print((char)data);
        }
    }
}
