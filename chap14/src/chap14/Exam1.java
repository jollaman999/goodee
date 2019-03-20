package chap14;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

class Student2 {
    private String name;
    private int eng;
    private int math;

    Student2(String name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getSum() {
        return getEng() + getEng();
    }

    @Override
    public String toString() {
        return "Student2 [name=" + name + ", eng=" + eng + ", math=" + math + "]";
    }
}

public class Exam1 {
    private static Student2[] List = {new Student2("홍길동", 75, 80),
            new Student2("김삿갓", 85, 85),
            new Student2("이몽룡", 80, 70),
            new Student2("임꺽정", 90, 95)};

    public static void main(String[] args) {
        System.out.println("영어 최고점 학생=>" + getMaxOrMin((a,b)->(a.getEng()>=b.getEng()?a:b)));
        System.out.println("영어 최저점 학생=>" + getMaxOrMin((a,b)->(a.getEng()<=b.getEng()?a:b)));
        System.out.println("수학 최고점 학생=>" + getMaxOrMin((a,b)->a.getMath()>=b.getMath()?a:b));
        System.out.println("수학 최저점 학생=>" + getMaxOrMin((a,b)->a.getMath()<=b.getMath()?a:b));

        BinaryOperator<Student2> f = (a, b)-> {
            int suma = a.getEng() + a.getMath();
            int sumb = b.getEng() + b.getMath();
            return (suma >= sumb)?a:b;
        };

        System.out.println("합계 점수 최고점 학생=>" + getMaxOrMin(f));

        f = (a, b)-> {
            int suma = a.getEng() + a.getMath();
            int sumb = b.getEng() + b.getMath();
            return (suma <= sumb)?a:b;
        };

        System.out.println("합계 점수 최저점 학생=>" + getMaxOrMin(f));
    }

    private static Student2 getMaxOrMin(BinaryOperator<Student2> f) {
        Student2 result = List[0];
        for (Student2 s : List)
            result = f.apply(result, s);
        return result;
    }
}
