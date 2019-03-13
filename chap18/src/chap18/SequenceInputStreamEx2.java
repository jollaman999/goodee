package chap18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("chap18/src/chap18/InputStreamEx1.java");
        FileInputStream f2 = new FileInputStream("chap18/src/chap18/ReaderEx1.java");
        FileInputStream f3 = new FileInputStream("err.log");

        int len;
        byte[] buf = new byte[1024];
        Vector<InputStream> v = new Vector<>();
        v.add(f1);
        v.add(f2);
        v.add(f3);

        SequenceInputStream sis = new SequenceInputStream(v.elements());
        while ((len = sis.read(buf)) != -1) {
            System.out.print(new String(buf, 0, len));
        }
    }
}
