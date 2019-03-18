package chap14;

/*
람다식에서 사용할 수 있는 인터페이스는 반드시 FunctionalInterface 여야 함.
FunctionalInterface : 추상인터페이스가 한개인 인터페이스를 말함.

@FunctionalInterface : 인터페이스에는 추상메서드가 한개임.

매개변수 없고, 리턴값도 없는 경우

매개변수 없음 : () ->
람다식 내부에 처리하는 구문이 한개인 경우 {} 를 생략할 수 있다.
 */

@FunctionalInterface
interface FunctionalInterface1 {
    void method();
    // void method1()
}

public class LamdaEx1 {
    public static void main(String[] args) {
        // 예전 방식으로 코딩
        FunctionalInterface1 f1 = new FunctionalInterface1() {
            @Override
            public void method() {
                System.out.println("인터페이스 객체");
            }
        };
        f1.method();

        // 람다 방식 1
        f1 = () -> {
            String str = "method call(1)";
            System.out.println(str);
        };
        f1.method();
        f1 = () -> {
            String str = "method call(2)";
            System.out.println(str);
        };
        f1.method();
        f1= () -> System.out.println("method call(2)");
        f1.method();

        // 람다 방식 2
        execute(f1);
        execute(()->{System.out.println("method call(3)");});
        execute(()->{System.out.println("method call(4)");});
    }

    static void execute(FunctionalInterface1 f) {
        f.method();
    }
}
