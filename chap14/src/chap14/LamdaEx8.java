package chap14;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

class  Student {
    private String name;
    private int eng;
    private int math;

    public Student(String name, int eng, int math) {
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
}

public class LamdaEx8 {
    private static Student[] List = {new Student("홍길동", 80, 90),
            new Student("김삿갓", 85, 90),
            new Student("이몽룡", 80, 70),
            new Student("임꺽정", 90, 95)};

    public static void printString(Function<Student, String> f) {
        for (Student s : List)
            System.out.print(f.apply(s) + " ");
        System.out.println();
    }

    public static void printInt(Function<Student, Integer> f) {
        for (Student s : List)
            System.out.print(f.apply(s) + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("학생 이름 : ");
        //printString(t->t.getName());
        printString(Student::getName);

        System.out.print("영어 점수 : ");
        //printInt(t->t.getEng());
        printInt(Student::getEng);

        System.out.print("수학 점수 : ");
        //printInt(t->t.getMath());
        printInt(Student::getMath);

        System.out.println("영어 점수 합계 : ");
        getTot(t->t.getEng());

        System.out.println("수학 점수 합계 : ");
        getTot(t->t.getMath());

        System.out.printf("영어 점수 평균 : %.2f\n", getAvg(t->t.getEng()));
        System.out.printf("수학 점수 평균 : %.2f\n", getAvg(t->t.getMath()));
    }

    public static void getTot(ToIntFunction<Student> f) {
        int sum = 0;
        for (Student s : List)
            sum += f.applyAsInt(s);
        System.out.println("합계 : " + sum);
    }

    public static double getAvg(ToDoubleFunction<Student> f) {
        double sum = 0;
        for (Student s : List)
            sum += f.applyAsDouble(s);
        return sum / List.length;
    }
}
