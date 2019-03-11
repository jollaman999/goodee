package chap15;

import java.util.*;

public class IteratorEx1 {
    public static void main (String[] args) {
        Iterator it = null;
        List list = new ArrayList();
        Set set = new HashSet();
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);
            set.add(i * 100);
        }
        it = list.iterator();
        print(it);
        it = set.iterator();
        print(it);
        System.out.println("1111111111111111");
        System.out.println(list);
        System.out.println("22222222222222222");
        System.out.println(set);

        Vector vlist = new Vector();
        for (int i = 1; i<= 5; i++) {
            vlist.add(i * 10);
        }
        // vlist = 10, 20, 30, 40, 50
        System.out.println("Enumeration 반복자 연습");
        Enumeration e = vlist.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        it = vlist.iterator();
    }

    private static void print(Iterator it) {
        System.out.println("33333333333333333333333333");
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
    }
}
