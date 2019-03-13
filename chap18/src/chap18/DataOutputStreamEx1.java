package chap18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.ser");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeBoolean(true); //1
        dos.writeInt(1234); //4
        dos.writeInt(65); //4
        dos.writeChar('a'); //2
        dos.writeDouble(123.45); //8
        System.out.println(dos.size() + "바이트 출력");
        dos.flush();
        dos.close();
    }
}
