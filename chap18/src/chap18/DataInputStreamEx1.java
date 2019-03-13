package chap18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("data.ser");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readDouble());
    }
}
