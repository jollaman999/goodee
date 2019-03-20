package chap16;

import java.util.Arrays;
import java.util.List;

public class MapEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동전", "춘향전", "구운몽", "전우치전", "사씨남정기");
        list.stream().mapToInt(String::length).forEach(l->System.out.print(l + " "));
        System.out.println();

        list.stream().mapToInt(s->s.length()).forEach(l->System.out.print(l + " "));
        System.out.println();
    }
}
