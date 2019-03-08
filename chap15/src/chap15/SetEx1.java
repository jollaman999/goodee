package chap15;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main (String[] args) {
        Object[] arr = {"1", 1, "2", "3", "3", "4", "4", "2", "4"};
        Set<Object> set1 = new HashSet<>();
        Set<Object> set2 = new HashSet<>();
        Set<Object> set3 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set1.add(arr[i])) {
                if (!set2.add(arr[i])) {
                    set3.add(arr[i]);
                }
            }
        }

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        for (Object o : set1) {
            System.out.println(o);
        }
    }
}
