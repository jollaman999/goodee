package chap14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class LamdaEx6 {
    static Integer[] arr = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        Consumer<String> c1 = t->System.out.println(t + " 8.0");
        c1.accept("Java");
        Consumer<Integer[]> c2 = t ->{
            int sum = 0;
            for (int i : t)
                sum += i;
            System.out.println("배열의 합 : " + sum);
        };
        c2.accept(arr);

        BiConsumer<String, String> c3 = (t, u)->System.out.println(t + u);
        c3.accept("Java", " 8.0");

        DoubleConsumer c4 = d->System.out.println("Java " + d);
        c4.accept(8.0);

        ObjIntConsumer<String> c5 = (t, i)->System.out.println(t + i);
        c5.accept("Java ", 8);
    }
}
