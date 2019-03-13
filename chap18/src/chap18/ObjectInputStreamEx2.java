package chap18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("object2.ser"));
        UserInfo2 u1 = (UserInfo2)ois.readObject();
        UserInfo2 u2 = (UserInfo2)ois.readObject();

        System.out.println("사용자1 : " + u1);
        System.out.println("사용자2 : " + u2);
    }
}
