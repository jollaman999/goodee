package chap14;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LamdaEx7 {
    public static void main(String[] args) {
        Supplier<String> s1 = ()->"Java";
        System.out.println(s1.get());

        IntSupplier s2 = ()->{
            int num = (int)(Math.random() * 10) + 1;
            return num;
        };

        IntSupplier s3 = ()->{
            int sum = 0;
            for (int i = 1; i <= 100; i++)
                sum += i;
            return sum;
        };

        System.out.println("1부터 10까지의 임의의 수 : " + s2.getAsInt());

        System.out.println("1부터 100까지의 합 : " + s3.getAsInt());

        double[] arr = {1, 2, 5, 5.6, 10, 20, 30.5};
        DoubleSupplier s4 = ()->{
            double sum = 0d;
            for (double d : arr)
                sum += d;
            return sum;
        };
        System.out.println("arr 배열의 요소들의 합 : " + s4.getAsDouble());
    }
}
