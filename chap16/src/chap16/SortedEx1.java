package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김삿갓", "이몽룡");
        System.out.println("기본 정렬");
        list.stream().sorted().forEach(s->System.out.println(s));
        System.out.println("기본의 역순 정렬");
        list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
    }
}
