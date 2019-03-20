package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}

public class FilterToStreamEx2 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("홍길동", "남자", 35),
                new Person("성춘향", "여자", 16),
                new Person("이몽룡", "남자", 17),
                new Person("향단이", "여자", 20)
        );

        // 남자 나이의 평균
        double ageAvgBoy = list.stream().filter(p->p.getGender().equals("남자"))
                .mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("남자 나이 평균 : " + ageAvgBoy);

        double ageAvgGirl = list.stream().filter(p->p.getGender().equals("여자"))
                .mapToInt(p->p.getAge()).average().getAsDouble();
        System.out.println("여자 나이 평균 : " + ageAvgGirl);
        System.out.println();

        // 나이가 20 이상인 사람의 이름과 나이 출력하기
        Stream<Person> page = list.stream().filter(p->p.getAge() >= 20);
        page.forEach(s->System.out.println(s.getName() + " : " + s.getAge()));

        // 나이의 합 구하기
        System.out.println("나이 합 : " + list.stream().mapToInt(p->p.getAge()).sum());

        // 이름 출력하기
        list.stream().forEach(s->System.out.println(s.getName()));
        System.out.println();
        list.stream().map(Person::getName).forEach(s->System.out.println(s));
    }
}
