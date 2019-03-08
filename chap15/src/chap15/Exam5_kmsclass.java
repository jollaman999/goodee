package chap15;

import java.util.Comparator;
import java.util.TreeSet;
/*
 * Student2 클래스 구현하기
 * 멤버변수 : 이름,국어, 영어, 수학
 * 멤버메서드 :String toString() : 각멤버변수값,총점,평균 출력
 *          int getTotal() : 점수의 합 리턴
 *          int compareTo() : 이름의 오름차순으로 정렬되도록 구현
 */
class Student2_kmsclass implements Comparable<Student2_kmsclass>{
    String name;
    int kor,eng,math;
    Student2_kmsclass(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public int getTotal() {
        return kor+eng+math;
    }
    public String toString() {
        return "이름:"+name + ",국어:"+kor + ",영어:"+eng + ",수학:"+math
                + ",총점:"+getTotal() + ",평균:" + getTotal()/3.0;
    }
    @Override
    public int compareTo(Student2_kmsclass s) {
        return name.compareTo(s.name);
    }
}
public class Exam5_kmsclass {
    public static void main(String[] args) {
        Student2_kmsclass[] arr = {
                new Student2_kmsclass("홍길동",90,80,70),
                new Student2_kmsclass("김삿갓",95,85,75),
                new Student2_kmsclass("이몽룡",80,95,95),
                new Student2_kmsclass("임꺽정",60,75,100)
        };
        System.out.println("기본정렬방식");
        TreeSet<Student2_kmsclass> set1 = makeTreeSet(arr,null);   //기본정렬방식(이름)
        System.out.println("총점기준 내림차순 정렬");
        TreeSet<Student2_kmsclass> set2 = makeTreeSet(arr,new Comparator<Student2_kmsclass>() {
            @Override
            public int compare(Student2_kmsclass o1, Student2_kmsclass o2) {
                return o2.getTotal() - o1.getTotal();
            }
        });
        System.out.println("국어 점수내림차순 정렬");
        TreeSet<Student2_kmsclass> set3 = makeTreeSet(arr,new Comparator<Student2_kmsclass>() {
            @Override
            public int compare(Student2_kmsclass o1, Student2_kmsclass o2) {
                return o2.kor - o1.kor;
            }
        });
        System.out.println("영어 점수내림차순 정렬");
        TreeSet<Student2_kmsclass> set4 = makeTreeSet(arr,new Comparator<Student2_kmsclass>() {
            @Override
            public int compare(Student2_kmsclass o1, Student2_kmsclass o2) {
                return o2.eng - o1.eng;
            }
        });
        System.out.println("수학 점수내림차순 정렬");
        TreeSet<Student2_kmsclass> set5 = makeTreeSet(arr,new Comparator<Student2_kmsclass>() {
            @Override
            public int compare(Student2_kmsclass o1, Student2_kmsclass o2) {
                return o2.math - o1.math;
            }
        });
    }
    private static TreeSet<Student2_kmsclass> makeTreeSet(Student2_kmsclass[] arr, Comparator<Student2_kmsclass> c) {
        TreeSet<Student2_kmsclass> set;
        if(c == null)
            set= new TreeSet<Student2_kmsclass>();
        else
            set = new TreeSet<Student2_kmsclass>(c);
        for(Student2_kmsclass s : arr) {
            set.add(s);
        }
        for(Student2_kmsclass s : set) {
            System.out.println(s);
        }
        return set;
    }

}