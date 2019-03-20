package chap16;

import java.util.Arrays;
import java.util.List;

public class FilterStreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "임꺽정", "홍길동");
        list.stream().distinct().forEach(s->System.out.println(s));
        System.out.println();

        list.stream().filter(s->s.startsWith("홍")).forEach(s->System.out.println(s));
        System.out.println();
        list.stream().distinct().filter(s->s.startsWith("홍")).forEach(s->System.out.println(s));
        System.out.println();
    }
}
