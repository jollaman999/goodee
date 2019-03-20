package chap14;

/*
람다 객체 내부의 this 참조 변수 사용하기
 */

interface FunctionalInterface5 {
    void method();
}

public class LamdaEx5 {
    public int iv = 5;
    void method() {
        FunctionalInterface5 f5 = ()->{
            //int iv = 100;
            System.out.println("LamdaEx5.this.iv=" + LamdaEx5.this.iv);
            System.out.println("this.iv=" + this.iv);
            System.out.println("iv=" + iv);
        };
        f5.method();
    }

    void method(int pv) {
        // pv += 100; // 함수객체가 속한 메서드의 지역변수는 상수화 필요
        FunctionalInterface5 f5 = ()->{
            int iv = 100;
            iv += 10;
            System.out.println("LamdaEx5.this.iv=" + LamdaEx5.this.iv);
            System.out.println("this.iv=" + this.iv);
            System.out.println("iv=" + iv);
            System.out.println("pv=" + pv);
        };
        f5.method();
    }

    public static void main(String[] args) {
        LamdaEx5 lbd = new LamdaEx5();
        lbd.method();
        lbd.method(10);
    }
}
