package chap15;

import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return ((Person) obj).age == this.age && ((Person) obj).name.equals(this.name);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (name + age).hashCode();
    }
}

/*
객체의 중복을 판단하는 기준.
 */

public class SetEx2 {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();

        set.add("홍길동");
        set.add("홍길동");
        set.add(new Person("김삿갓", 30));
        set.add(new Person("김삿갓", 30));
        System.out.println(set);

        Person p1 = new Person("김삿갓", 30);
        Person p2 = new Person("김삿갓", 30);

        System.out.println(p1.equals(p2) + " " + p1.hashCode() + ", " + p2.hashCode());
    }
}
