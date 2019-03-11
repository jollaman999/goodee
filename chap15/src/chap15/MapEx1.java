package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};

        int[] nums = {1234, 4567, 2530, 9870, 3456};
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], nums[i]);
        }
        System.out.println(map);

        // 키값을 주고 객체를 리턴 : get
        System.out.println("김삿갓 = " + map.get("김삿갓"));
        System.out.println("홍길동의 전화번호 : " + map.get("홍길동"));
        System.out.println("성춘향의 전화번호 : " + map.get("성춘향")); // null

        // map 에서 key 들만 조회하기 : keySet()
        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k + "=" + map.get(k));
        }

        // map 에서 values(객체) 들만 조회하기
        Collection<Integer> values = map.values();
        for (Integer v : values) {
            System.out.println(v);
        }

        // map 에서 (key, value)의 쌍인 객체로 조회하기
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for (Map.Entry<String, Integer> m : entry) {
            System.out.println(m.getKey() + "=" + m.getValue());
        }
    }
}
