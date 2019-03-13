package chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
    private String name;
    private int age;
    //private String jumin;

    // transient : jumin 변수의 값은 직렬화에서 제외시킴.
    private transient String jumin;
    Customer(String name, int age, String jumin) {
        this.name = name;
        this.age = age;
        this.jumin = jumin;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", age=" + age
                + ", jumin=" + jumin + "]";
    }
}

public class ObjectOutputStreamEx1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
               new FileOutputStream("object.ser"));
        Customer c1 = new Customer("홍길동", 20, "1234");
        Customer c2 = new Customer("김삿갓", 30, "5678");
        oos.writeObject(c1);
        oos.writeObject(c2);
        System.out.println("고객1 : " + c1);
        System.out.println("고객2 : " + c2);
    }
}
