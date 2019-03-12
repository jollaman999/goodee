package chap18;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos = new FileOutputStream("buffered.txt");
        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
            fos.write((data + "\n").getBytes());
        }
    }
}
