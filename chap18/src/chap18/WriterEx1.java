package chap18;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx1 {
    public static void main(String[] args) throws IOException {
        Writer writer = new OutputStreamWriter(System.out);
        writer.write('1');
        writer.write('2');
        writer.write('3');
        writer.write('A');
        writer.write('B');
        writer.write('C');
        writer.write('가');
        writer.write('나');
        writer.write('다');

        writer.flush();
    }
}
