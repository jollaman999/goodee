package chap15;

import java.util.Comparator;
import java.util.TreeSet;

class Phone implements Comparable {
    int number;
    String model;

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone [number=" + number + ", model =" + model + "]";
    }

    @Override
    public int compareTo(Object o) { // 결과 : 양수 : this 가 뒤쪽, 음수 : this 가 앞쪽
        if (o instanceof Phone) {
            return this.number - ((Phone) o).number;
        }
        return 0;
    }


}

class ModelAsc implements Comparator<Phone> {
    @Override
    public int compare(Phone p1, Phone p2) {
        return p1.model.compareTo(p2.model);
    }
}

public class SetEx5 {
    public static void main(String[] args) {
        TreeSet<Phone> set = new TreeSet<>();
        set.add(new Phone(1234, "삼성"));
        set.add(new Phone(5678, "LG"));
        set.add(new Phone(2345, "애플"));
        for (Phone p : set)
            System.out.println(p);

        System.out.println("전화번호의 역순으로 정렬");
        TreeSet<Phone> set2 = new TreeSet<>(Comparator.reverseOrder());
        set2.add(new Phone(1234, "삼성"));
        set2.add(new Phone(5678, "LG"));
        set2.add(new Phone(2345, "애플"));
        for (Phone p : set2)
            System.out.println(p);

        System.out.println("model의 오름차순으로 정렬하기");
        //TreeSet<Phone> set3 = new TreeSet<>(new ModelAsc());
        TreeSet<Phone> set3 = new TreeSet<>(new Comparator<Phone>() {
            @Override
            public int compare(Phone p1, Phone p2) {
                return p1.model.compareTo(p2.model);
            }
        });
        set3.add(new Phone(1234, "삼성"));
        set3.add(new Phone(5678, "LG"));
        set3.add(new Phone(2345, "애플"));
        for (Phone p : set3)
            System.out.println(p);

    }
}
