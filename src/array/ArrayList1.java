package array;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //선언
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // 데이터 추가 add(data)
        arrayList.add(1);
        arrayList.add(2);
        // 특정 아이템을 읽고 싶을때 get(index)
        System.out.println(arrayList.get(0));

        // 특정 아이템의 값을 변경하고 싶을때 set(index , data)
        arrayList.set(0 , 5);
        System.out.println(arrayList.get(0));

        // 특정 인덱스의 데이터를 삭제하고 싶을때 remove(index)
        arrayList.remove(0);
        System.out.println(arrayList.get(0));

        // 배열의 사이즈 size()
        System.out.println(arrayList.size());
    }
}
