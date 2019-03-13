package chap18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Print {
    int x;

    public String toString() {
        return "x =" + x;
    }
}

public class PrintStreamEx1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("print.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("홍길동");
        ps.println(1234);
        ps.println(true);
        ps.println('a');
        ps.println(new Print());
        ps.flush();


        // print2.txt 파일에 바로 저장가능.
        PrintStream ps2 = new PrintStream("print2.txt");
        ps2.println("홍길동");
        ps2.println(1234);
        ps2.println(true);
    }
}
