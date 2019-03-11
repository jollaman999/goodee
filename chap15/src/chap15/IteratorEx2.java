package chap15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 1; i <= 5; i++)
            list.add(i * 10);
        ListIterator lit = list.listIterator();
        //list = 10, 20, 30, 40, 50
        while (lit.hasNext())
            System.out.println(lit.next());
        System.out.println("============================");
        while (lit.hasPrevious())
            System.out.println(lit.previous());
    }
}
