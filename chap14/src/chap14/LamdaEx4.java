package chap14;

import static java.lang.Math.*;

interface FunctionalInterface4 {
    int method(int x, int y);
}

public class LamdaEx4 {
    public static void main(String[] args) {
        FunctionalInterface4 f4 = (x,y) -> {
            return x * y;
        };

        System.out.println();
        System.out.println("두 수의 곱 : " + f4.method(10, 5));

        f4 = (x,y) -> x+y;
        System.out.println("두 수의 합 : " + f4.method(10, 20));

        System.out.println("두 수의 차 : " + calc((x,y)->x-y,20,10));

        // calc 함수를 이용하기
        System.out.println("두 수 중 큰 값 : " + calc((x, y)->max(x, y), 20, 10));
        System.out.println("두 수 중 작은 값 : " + calc((x, y)->min(x, y), 20, 10));
        System.out.println("x/y 의 몫 : " + calc((x, y)->x/y, 20, 10));
    }

    static int calc(FunctionalInterface4 f, int x, int y) {
        return f.method(x, y);
    }
}
