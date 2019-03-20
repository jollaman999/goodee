package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student3 implements Comparable<Student3> {
    private String studno;
    private String name;
    private int grade;

    public Student3(String studno, String name, int grade) {
        this.studno = studno;
        this.name = name;
        this.grade = grade;
    }

    public String getStudno() {
        return studno;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "studno=" + studno + ", name=" + name + ", grade=" + grade;
    }

    @Override
    public int compareTo(Student3 s) {
        return this.studno.compareTo(s.getStudno());
    }
}

public class SortedEx2 {
    public static void main(String[] args) {
        List<Student3> list = Arrays.asList(
                new Student3("1234", "홍길동", 1),
                new Student3("2345", "김삿갓", 2),
                new Student3("3456", "이몽룡", 3),
                new Student3("4567", "임꺽정", 4)
        );
        // 학번순으로 정렬되도록 프로그램 작성하기
        list.stream().sorted().forEach(s->System.out.println(s));
        System.out.println();
        // 학번의 역순으로 정렬되도록 프로그램 작성하기
        list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
        System.out.println();

//        list.stream().sorted(new Comparator<Student3>() {
//            @Override
//            public int compare(Student3 s1, Student3 s2) {
//                return s1.getName().compareTo(s2.getName());
//            }
//        }).forEach(s->System.out.println(s));

        list.stream().sorted((s1, s2)->s1.getName().compareTo(s2.getName())).forEach(s->System.out.println(s));
    }
}
