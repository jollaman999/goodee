package chap16;

/*
난수를 스트림화 하기 : Random 클래스 이용
 */

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class RandomToStreamEx1 {
    public static void main(String[] args) {
        System.out.println("int 형 난수 스트림");
        IntStream is = new Random().ints(3); // 정수형 난수 3개
        is.forEach(s->System.out.print(s + " "));
        System.out.println();
        is = new Random().ints(10, 0, 3); // 0부터 2사이이ㅡ 정수형 난수 10개
        is.forEach(s->System.out.print(s + " "));
        System.out.println();

        // 1부터 45까지의 난수 6개 저장
        is = new Random().ints(6, 1, 46);
        is.forEach(s->System.out.print(s + " "));

        System.out.println("\nlong 형 난수 스트림 : Random().longs");
        // long형 난수 3개 저장하는 스트림
        LongStream ls = new Random().longs(3);
        ls.forEach(s->System.out.print(s + " "));
        System.out.println();

        ls = new Random().longs(3, 0, 10); // 0부터 9까지의 long형 난수 3개
        ls.forEach(s->System.out.print(s + " "));
        System.out.println();

        // char 형 난수
        is = new Random().ints(10, 'A', 'Z' + 1);
        is.forEach(s->System.out.print((char)s + " "));
        System.out.println();

        is = "Stream을 배우자.".chars();
        is.forEach(s->System.out.print((char)s +" "));
        System.out.println();

        // double 형 스트림
        System.out.println("\ndouble 형 난수 스트림 : Random().doubles");
        DoubleStream ds = new Random().doubles(3);
        ds.forEach(s->System.out.print(s + " "));
        System.out.println();
    }
}
