package chap15;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx3 {
    public static void main(String[] args) {
//      TreeSet<String> set = new TreeSet<>();
        SortedSet<String> set = new TreeSet<>();

        String from = "bat";
        String to = "d";

        set.add("abc");
        set.add("bat");
        set.add("azz");

        set.add("car");
        set.add("Car");
        set.add("disc");

        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");

        set.add("fan");

        System.out.println(set);
        System.out.println("from : " + from + ", to : " + to);
        System.out.println(set.subSet(from, to));
        System.out.println("from : " + from + ", to : " + to + "zzzz");
        System.out.println(set.subSet(from, to + "zzzz"));

        // 대소문자 구분없이 오름차순 정렬하기
        Comparator<String> c = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };
        Set<String> set2 = new TreeSet<>(c);
        set2.add("car");
        set2.add("Care");
        set2.add("abc");
        System.out.println(set2);

        // 대소문자 구분없이 내림차순 정렬하기
        Set<String> set3 = new TreeSet<>(c.reversed()); // jdk 8.0 이후 가능
        // reversed : Comparator 의 default 메서드
        set3.add("car");
        set3.add("Care");
        set3.add("abc");
        System.out.println(set3);

        // 내림차순 정렬
        Set<String> set4 = new TreeSet<>(Comparator.reverseOrder()); // jdk 8.0 이후 가능
        // reverseOrder : Comparator 안의 static 메서드
        set4.add("car");
        set4.add("Care");
        set4.add("abc");
        System.out.println(set4);
    }
}
