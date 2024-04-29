package hash;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        // HashSet 선언
        HashSet<Integer> set1 = new HashSet<Integer>();

        //HashSet 값 추가
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // HashSet delete
        set1.remove(1); // 1 제거
        set1.clear(); // 데이터 전부 제거

        //HashSet 값 추가
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // HashSet size
        System.out.println(set1.size());

        // HashSet print
        System.out.println(set1);

        Iterator iter = set1.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
