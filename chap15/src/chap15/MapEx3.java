package chap15;

/*
Properties 클래스
    1. Hashtable의 하위 클래스
    2. 제네릭 표현을 안함. => 키, 객체가 모두 String 인 클래스
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapEx3 {
    public static void main(String[] args) throws IOException {
        Properties pr = new Properties();
        FileInputStream fis = new FileInputStream("a.properties");
        pr.load(fis);
        System.out.println(pr);
        pr.list(System.out);

        // 키들만 조회하여 화면에 출력하기 : keySet()
        // 객체들만 조회하여 화면에 출력하기 : values()
        // (키, 객체) 들을 조회하여 화면에 출력하기 : entrySet()
        Set<Object> keys = pr.keySet();
        for (Object o : keys) {
            System.out.println((String)o);
        }

        Collection<Object> values = pr.values();
        for (Object o : values) {
            System.out.println((String)o);
        }

        Set<Map.Entry<Object, Object>> entry = pr.entrySet();
        for (Map.Entry<Object, Object> o : entry) {
            System.out.println(o);
        }

        for (Object o : pr.entrySet()) {
            Map.Entry m = (Map.Entry)o;
            System.out.println(m);
        }
    }
}
