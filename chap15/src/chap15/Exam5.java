package chap15;

import java.util.Comparator;
import java.util.TreeSet;

/*
Student2 클래스 구현하기
멤버변수 : 이름, 국어, 영어, 수학
멤버메서드 : toString() : 각 멤버변수값, 총점, 평균 출력
            getTotal() : 점수의 합 리턴
            compareTo() : 이름의 오름차순으로 정렬되도록 구현
 */

class Student2 implements Comparable<Student2> {
    private String name;
    int ko;
    int en;
    private int math;
    int sum;
    private int avg;

    Student2(String name, int ko, int en, int math) {
        this.name = name;
        this.ko = ko;
        this.en = en;
        this.math = math;
        this.sum = ko + en + math;
        this.avg = sum / 3;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 국어점수 : " + ko + ", 영어점수 : " + en
                + ", 수학점수 : " + math + ", 총점 : " + sum + ", 평균 : " + avg;
    }


    @Override
    public int compareTo(Student2 s) {
        return this.name.compareTo(s.name);
    }
}

public class Exam5 {
    public static void main(String[] args) {
        Student2[] arr = {
                new Student2("홍길동", 90, 80, 70),
                new Student2("김삿갓", 95, 85, 75),
                new Student2("이몽룡", 80, 95, 95),
                new Student2("임꺽정", 60, 75, 100)
        };

        TreeSet<Student2> set1; // 기본 정렬 방식 (이름)
        TreeSet<Student2> set2; // 총점기준 내림차순 정렬
        TreeSet<Student2> set3; // 국어 점수 내림차순 정렬
        TreeSet<Student2> set4; // 영어 점수 내림파순 정렬

        System.out.println("기본정렬 (이름순)");
        set1 = new TreeSet<>();
        for (Student2 student2 : arr)
            set1.add(student2);
        for (Student2 s : set1)
            System.out.println(s);

        System.out.println("총점 기준 내림차순");
        set2 = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s2.sum - s1.sum;
            }
        });
        for (Student2 student2 : arr)
            set2.add(student2);
        for (Student2 s : set2)
            System.out.println(s);

        System.out.println("국어점수 기준 내림차순");
        set3 = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s2.ko - s1.ko;
            }
        });
        for (Student2 student2 : arr)
            set3.add(student2);
        for (Student2 s : set3)
            System.out.println(s);

        System.out.println("영어점수 기준 내림차순");
        set4 = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s2.en - s1.en;
            }
        });
        for (Student2 student2 : arr)
            set4.add(student2);
        for (Student2 s : set4)
            System.out.println(s);
    }
}
