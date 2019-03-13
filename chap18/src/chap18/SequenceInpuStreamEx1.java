package chap18;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInpuStreamEx1 {
    public static void main(String[] args) throws IOException {
        byte[] arr1 = {1, 2, 3, 4, 5};
        byte[] arr2 = {6, 7, 8, 9, 10};
        ByteArrayInputStream stream1 = new ByteArrayInputStream(arr1);
        ByteArrayInputStream stream2 = new ByteArrayInputStream(arr2);
        SequenceInputStream in = new SequenceInputStream(stream1, stream2);
        int data;
//        System.out.println("stream1 의 내용");
//        while ((data = stream1.read()) != -1) {
//            System.out.println((byte)data);
//        }
//        System.out.println("stream2 의 내용");
//        while ((data = stream2.read()) != -1) {
//            System.out.println((byte)data);
//        }
        System.out.println("연결 의 내용");
        while ((data = in.read()) != -1) {
            System.out.println((byte)data);
        }
    }
}