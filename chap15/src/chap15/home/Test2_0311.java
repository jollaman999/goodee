package chap15.home;

        import java.util.*;

/*
2. 다음 keys , values , entry 객체를 Iterator 객체로 변경하여 출력하기
[결과]
김삿갓=4567
홍길동=1234
이몽룡=2350
임꺽정=9870
4567
1234
2350
9870
김삿갓=4567
홍길동=1234
이몽룡=2350
임꺽정=9870
 */
public class Test2_0311 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정"};
        int[] nums = {1234, 4567, 2350, 9870};

        for (int i = 0; i < names.length; i++) {
            map.put(names[i], nums[i]);
        }

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        Set<Map.Entry<String, Integer>> entry = map.entrySet();

        Iterator it_keys = keys.iterator();
        Iterator it_values = values.iterator();
        Iterator it_entry = entry.iterator();

        while (it_keys.hasNext()) {
            System.out.printf("%s=%s\n", it_keys.next(), it_values.next());
        }

        it_values = values.iterator();
        while (it_values.hasNext()) {
            System.out.printf("%s\n", it_values.next());
        }

        while (it_entry.hasNext()) {
            System.out.printf("%s\n", it_entry.next());
        }
    }
}
