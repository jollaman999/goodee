package chap16.home;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
    private String name;
    private String gender;
    private int age;

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    String getGender() {
        return gender;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name=" + getName() + ", gender=" + getGender() + ", age=" + getAge();
    }
}

public class Exam2 {
    private static List<Person> list =
            Arrays.asList(
                    new Person("홍길동", "남자", 40),
                    new Person("성춘향", "여자", 30),
                    new Person("이몽룡", "남자", 25),
                    new Person("향단이", "여자", 22)
            );

    public static void main(String[] args) {
        System.out.println("남자 평균 나이:" + avg(t->t.getGender().equals("남자")));
        System.out.println("여자 평균 나이:" + avg(t->t.getGender().equals("여자")));
    }

    private static double avg(Predicate<Person> op) {
        int count = 0, sum = 0;

        for (Person p : list) {
            if (op.test(p)) {
                count++;
                sum += p.getAge();
                System.out.println(p);
            }
        }

        return (double)sum / count;
    }
}
