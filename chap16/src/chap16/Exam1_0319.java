package chap16;

import javax.sql.rowset.serial.SerialStruct;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam1_0319 {
    public static void main(String[] args) {
        List<Student4> list = Arrays.asList(
                new Student4("홍길동", 90, Student4.Gender.MALE, Student4.City.PUSAN),
                new Student4("이몽룡", 80, Student4.Gender.MALE),
                new Student4("성춘향", 95, Student4.Gender.FEMALE),
                new Student4("향단이", 85, Student4.Gender.FEMALE, Student4.City.PUSAN));

        // 도시별로 학생의 평균 구하기
        Map<Student4.City, Double> map = list.stream().collect(Collectors.groupingBy(
                Student4::getCity, Collectors.averagingDouble(Student4::getScore)
        ));
        System.out.println("서울학생평균:" + map.get(Student4.City.SEOUL));
        System.out.println("부산학생평균:" + map.get(Student4.City.PUSAN));

        // 서울학생, 부산학생의 이름 출력하기
//        Map<Student4.City, String> map2 = list.stream().collect(Collectors.groupingBy(
//                Student4::getCity, Collectors.mapping(Student4::getName, Collectors.joining(", "))));
        //Map<Student4.City, List<String>> map2 = list.stream().collect(Collectors.groupingBy(Student4::getCity, Collectors.mapping(Student4::getName, Collectors.toList())));

        Map<Student4.City, List<Student4>> map2 = list.stream()
                .collect(Collectors.groupingBy(
                        Student4::getCity,
                        Collectors.toList()
                ));
        System.out.println("서울학생 목록:" + map2.get(Student4.City.SEOUL));
        System.out.println("부산학생목록:" + map2.get(Student4.City.PUSAN));
    }

}
