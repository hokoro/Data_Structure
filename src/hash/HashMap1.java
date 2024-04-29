package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String , Integer> hashMap = new HashMap<>();    // HashMap<Key,Value>으로 선언하고 Key와 Value의 타입을 지정해 줘야 한다.
        Map<String,Integer> map = new HashMap<>();
        // insert
        hashMap.put("user1" , 111);
        hashMap.put("user2" , 112);
        hashMap.put("user3" , 113);

        map.put("user4",114);
        map.put("user5",115);
        map.put("user6",116);

        hashMap.putAll(map);

        hashMap.putIfAbsent("user7",117);   // 해당 key가 없는 경우에 추가

        // delete
        hashMap.remove("user1"); // key에 해당하는 값을 삭제
        System.out.println(hashMap.remove("user2" , 112));  // key랑 value가 둘다 일치하는 값 삭제후 성공하면 true 리턴
        System.out.println(hashMap.remove("user8" , 112));  // false 리턴

        // update
        hashMap.replace("user3" , 119);
        hashMap.replace("user4" , 114 , 120);

        //contains
        hashMap.put("user1" , 111);
        hashMap.put("user2" , 112);
        hashMap.put("user3" , 113);

        hashMap.put("user4" , 114);
        hashMap.put("user5" , 115);
        hashMap.put("user6" , 116);

        System.out.println(hashMap.containsKey("user1"));
        System.out.println(hashMap.containsKey("user0"));
        System.out.println(hashMap.containsValue(111));
        System.out.println(hashMap.containsValue(110));

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());

        // get
        System.out.println(hashMap.get("user1"));
        System.out.println(hashMap.getOrDefault("user10",999));
        Set<Map.Entry<String, Integer>> data = hashMap.entrySet();
        System.out.println(data);   // key-value를 set으로 리턴
        System.out.println(hashMap.keySet());   // 키만 리턴
        System.out.println(hashMap.values());   // 값만 리턴
    }
}
